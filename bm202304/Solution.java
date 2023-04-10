package bm202304;

import java.util.Locale;

/*
* 문자길이가 5보다 크면 대문자로 바꾸는 프로그램
* */
public class Solution {

  public static void main(String[] args) {
    String[] params = {"test", "test12"};
    String solution = solution(params);
    System.out.println("solution = " + solution);
  }

  private static String solution(String[] params) {
    String answer = "없음";
    
    for (String param : params) {
      String upperStr = param.toUpperCase(Locale.ROOT);
      if(upperStr.length() > 5){
        answer = upperStr;
        return answer;
      }
    }
    return answer;
  }
}
