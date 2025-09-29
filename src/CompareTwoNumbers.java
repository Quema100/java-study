import java.util.InputMismatchException;
import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        int numFirst, numSecond;
        boolean isInt = false;
        Scanner scanner = new Scanner(System.in);

        while (!isInt) {
            try {
                System.out.print("첫번째 정수를 입력하세요: ");
                numFirst = scanner.nextInt();
                System.out.print("두번째 정수를 입력하세요: ");
                numSecond = scanner.nextInt();

                if (numFirst>numSecond)
                    System.out.println("첫 번째 수가 더 큽니다.");
                else if (numFirst<numSecond)
                    System.out.println("두 번째 수가 더 큽니다.");
                else
                    System.out.println("두 수는 같습니다.");
                isInt = true;
                scanner.close();
            } catch (InputMismatchException err) {
                System.out.println("정수를 입력하세요.");
                scanner.nextLine();
            }
        }
    }
}
