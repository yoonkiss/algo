import java.util.Scanner;

public class Won_002 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int subjectCount = scanner.nextInt();
    int[] scores = new int[subjectCount];

    int sum = 0;
    int max = 0;
    for (int i = 0; i < scores.length; i++) {
      int currentScore = scanner.nextInt();
      if(max < currentScore) {
        max = currentScore;
      }

      sum += currentScore;
    }

    System.out.println(sum * 100 / max / subjectCount);
  }
}
