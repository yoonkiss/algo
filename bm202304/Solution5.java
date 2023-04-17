package bm202304;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution5 {

  public static void main(String[] args) {
    int[] card = {1,3,2,5,3,1};
    int[] solution = solution(card);

    for (int i : solution) {
      System.out.println("i = " + i);
    }
    
    System.out.println("solution = " + solution);
  }

  private static int[] solution(int[] card) {
    Arrays.sort(card);
    List<Integer> cards = new ArrayList<>();
    for (int i = 0; i < card.length; i ++) {
      if(i == card.length - 1){
        cards.add(card[i]);
        break;
      }
      if(card[i] == card[i+1]) {
        i+=1;
        continue;
      }

      if(i % 2 ==0) cards.add(card[i]);
    }
    int anwer[] = new int[cards.size()];
    for (int i = 0; i <cards.size(); i++) {
      anwer[i] = cards.get(i);
    }
    
    return anwer;
  }

}
