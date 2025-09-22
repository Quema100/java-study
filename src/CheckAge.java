import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputCheck = false;
        int age;
        while (!inputCheck) {
            try {
                System.out.print("나이를 입력하세요: ");
                age = scanner.nextInt();
                if (age >= 18)
                    System.out.println("즐거운 시간 보내세요.");
                else
                    System.out.println("집으로 돌아가세요.");
                System.out.println("협조 감사합니다.");
                inputCheck = true;
                scanner.close();
            } catch (InputMismatchException err) {
                System.out.println("입력하신 나이가 이상합니다. \n다시입력해주세요.");
                inputCheck = false;
                scanner.nextLine();
            }
        }
    }
}
