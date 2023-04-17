package W1;

import java.util.Scanner;

public class Won_001 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.nextInt();

    String number = scanner.next();
    char[] arrayNumbers = number.toCharArray();
    int sum = 0;
    for (char arrayNumber : arrayNumbers) {
      sum += arrayNumber - '0';
    }

    System.out.println(sum);
  }
}