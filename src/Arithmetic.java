import java.util.InputMismatchException;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String res;
        double num1 = 0, num2 = 0;
        boolean validInputFirst = false;
        boolean validInputSecond = false;
        System.out.print("계산 방식을 선택하세요: ");
        res = scanner.nextLine();

        while (!validInputFirst) {
            try {
                System.out.print("계산 할 첫번째 값 입력: ");
                num1 = scanner.nextDouble();
                validInputFirst = true; 
            } catch (InputMismatchException e) {
                System.out.println("첫번째 값이 올바르지 않습니다. 숫자로 입력하세요.");
                scanner.nextLine(); 
            }
        }

        while (!validInputSecond) {
            try {
                System.out.print("계산 할 두번째 값 입력: ");
                num2 = scanner.nextDouble();
                validInputSecond = true; 
            } catch (InputMismatchException e) {
                System.out.println("두번째 값이 올바르지 않습니다. 숫자로 입력하세요.");
                scanner.nextLine(); 
            }
        }

        switch (res) {
            case "더하기": case "+":
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case "빼기":
            case "-":
                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                break;
            case "나누기":
            case "/":
                System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                break;
            case "곱하기":
            case "x":
                System.out.println(num1 + "x" + num2 + "=" + (num1 * num2));
                break;
            default:
                System.out.println("연산이 불가합니다 다시 입력해주세요.");
                main(null);
                break;
        }

        scanner.close();

    }
}
