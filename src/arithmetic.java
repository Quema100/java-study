import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String res;
        double num1, num2;

        System.out.println("계산 방식을 선택하세요: ");
        res = scanner.nextLine();
        System.out.println("계산 할 첫번째 값 입력: ");
        num1 = scanner.nextDouble();
        System.out.println("계산 할 두번째 값 입력: ");
        num2 = scanner.nextDouble();

        switch (res) {
            case "더하기":
            case "+":
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
        }

        scanner.close();
    }
}
