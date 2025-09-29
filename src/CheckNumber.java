import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean isInt = false;
        while (!isInt) {
            try {
                System.out.print("정수를 입력하세요: ");
                num = scanner.nextInt();
                if (num > 0)
                    System.out.println(num + "은 양수 입니다.");
                else if (num < 0)
                    System.out.println(num + "은 음수 입니다.");
                else
                    System.out.println(num + "은 0입니다.");
                isInt = true;
                scanner.close();
            } catch (InputMismatchException err) {
                System.out.println("정수 값을 입력하세요");
                scanner.nextLine();
            }
        }
    }
}
