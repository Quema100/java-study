import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        double score;
        boolean isDouble = false;
        Scanner scanner = new Scanner(System.in);
        while (!isDouble) {
            try {
                System.out.print("당신의 점수를 입력하세요: ");
                score = scanner.nextDouble();
                if (score >= 90)
                    System.out.println("A");
                else if (score >= 80)
                    System.out.println("B");
                else if (score >= 70)
                    System.out.println("C");
                else if (score >= 60)
                    System.out.println("D");
                else
                    System.out.println("F");
                isDouble = true;
                scanner.close();
            } catch (InputMismatchException err) {
                System.out.println("올바른 값을 입력하세요.");
                scanner.nextLine();
            }
        }
    }
}
