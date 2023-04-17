package bm202304;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
* 중복 문자를 지우고 'a,b,c'순으로 문자를 출력
* */
public class Solution2 {

  public static void main(String[] args) {
    String[] leftArray = {"a",  "c", "b", "c"};
    String[] rightArray = {"b", "c", "d"};
    String solution = solution(leftArray, rightArray);
    System.out.println("solution = " + solution);
  }

  private static String solution(String[] leftArray, String[] rightArray) {
    List<String> temp = new ArrayList<>();

    for (String left : leftArray) {
      if(Arrays.asList(rightArray).contains(left)) temp.add(left);
    }

    Collections.sort(temp);
    Set<String> strSet = new HashSet<>(temp);

    StringBuilder sb = new StringBuilder();
    List<String> targets = new ArrayList<>(strSet);

    for (int i = 0; i < targets.size(); i++) {
      if(i > 0) sb.append(",");
      sb.append(targets.get(i));
    }

    return sb.toString();
  }
}
