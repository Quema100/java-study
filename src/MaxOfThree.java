import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        int numFirst, numSecond, numThird, max;
        boolean isInt = false;
        Scanner scanner = new Scanner(System.in);

        while (!isInt)
            try {
                System.out.print("첫번째 정수를 입력하세요: ");
                numFirst = scanner.nextInt();
                System.out.print("두번째 정수를 입력하세요: ");
                numSecond = scanner.nextInt();
                System.out.print("세번째 정수를 입력하세요: ");
                numThird = scanner.nextInt();


                if (numFirst > numSecond) {
                    max = Math.max(numFirst, numThird);
                } else {
                    max = Math.max(numSecond, numThird);
                }

                System.out.println("가장 큰 수는 "+max+"입니다.");
                isInt = true;
                scanner.close();
            } catch (InputMismatchException err) {
                System.out.println("정수를 입력하세요");
                scanner.nextLine();
            }

    }
}
