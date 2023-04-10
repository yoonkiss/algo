package baemin202304;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* 문자열을 입력받아 각 ID별 상품의 총 가격을 계산하는 프로그램
*
* */
public class Solution3 {

  public static void main(String[] args) {
    String[] productInfo= {"123456789,유기농쌀 4Kg,50000", "2345678882,배달이캐릭터숟가락,3000"};
    String[] dailyProductSales= {"20220810,123456789,5", "20220810,2345678882,30", "20220811,123456789,7"};

    String[] solution = solution(productInfo, dailyProductSales);
    for (String s : solution) {
      System.out.println(s);
    }
    System.out.println("solution = " + solution);
  }

  private static String[] solution(String[] productInfo, String[] dailyProductSales) {
    List<String> products = new ArrayList(Arrays.asList(productInfo));
    List<String> sales = new ArrayList(Arrays.asList(dailyProductSales));
    List<String> answerList = new ArrayList<>();
    //sales 저장된 순서로 읽어서 id, 상품명, 일일 판매 금액 형식으로 return
    for (String info : sales) {
      StringBuilder sb = new StringBuilder();
      String[] datas = info.split(",");
      String date = datas[0];
      String id = datas[1];
      int count = Integer.parseInt(datas[2]);

      List<String> collect = products.stream()
          .filter(s -> {
            String[] split = s.split(",");
            return id.equals(split[0]);
          })
          .collect(Collectors.toList());
      String[] split = collect.get(0).split(",");

      String data = sb.append(date).append(",")
          .append(id).append(",")
          .append(split[1]).append(",")
          .append(Integer.parseInt(split[2]) * count).toString();

      answerList.add(data);
    }
    return answerList.toArray(new String[0]);
  }
}
