package baemin202304;

import java.util.regex.Pattern;
/*
* pathVariable 형태의 uri를 query string 형식으로 변경하는 프로그램
*
* */
public class Solution4 {

  public static void main(String[] args) {
    String pathVariableUrl = "/payment/1234589/cancel";
    String solution = solution(pathVariableUrl);
    System.out.println("solution = " + solution);
  }

  private static String solution(String pathVariableUrl) {
    String answer = "error";
    String targetUrl = pathVariableUrl.trim();
    if(targetUrl.length() != pathVariableUrl.length()) return answer;

    String[] split = targetUrl.split("/");
    StringBuilder sb = new StringBuilder();

    for (int i = 1; i < split.length ; i++) {

      if(i == 1 && !split[i].equals("payment")) return answer;
      if(i == 2 && !validPaymentId(split[2])) return answer;
      if(i == 3 && !validPaymentMethod(split[3])) return answer;

      if(i==2) {
        sb.append("/").append(split[3]);
        continue;
      }
      if(i==3){
        sb.append("?paymentId=").append(split[2]);
        break;
      }
      sb.append("/");
      sb.append(split[i]);
    }
    answer = sb.toString();
    return answer;
  }

  private static boolean validPaymentMethod(String method) {
    return Pattern.matches("^[a-zA-Z]*$",method) && (method.length() > 0 && method.length() <= 10);
  }

  private static boolean validPaymentId(String id) {
    return Pattern.matches("^[0-9]*$",id) && (id.length() > 0 && id.length() < 10);
  }

}
