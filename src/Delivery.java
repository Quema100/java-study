import java.util.InputMismatchException;
import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        String personAddress, personName;
        boolean validInput = false;
        double weight = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("받는 사람: ");
        personName = scanner.nextLine();
        System.out.print("받는 사람 주소: ");
        personAddress = scanner.nextLine();

        while (!validInput) {
            try {
                System.out.print("배송 물건 무게(g): ");
                weight = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("무게가 올바르지 않습니다. 숫자로 입력하세요.");
                scanner.nextLine();
            }
        }

        System.out.println("받는 사람:" + personName + "\n주소:" + personAddress + "\n배송비:" + weight * 5 + "(원)");

        scanner.close();

    }
}
