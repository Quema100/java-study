import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        int year;
        boolean isInt = false;
        Scanner scanner = new Scanner(System.in);
        while (!isInt)
            try {
                System.out.print("연도를 입력하세요: ");
                year = scanner.nextInt();

                if (( (year % 4 == 0) && (year % 100 !=0) )|| (year % 400 == 0))
                    System.out.println("윤년입니다.");
                else
                    System.out.println("평년입니다.");
                isInt = true;
                scanner.close();
            } catch (InputMismatchException err) {
                System.out.println("올바른 연도를 입력하세요.");
                scanner.nextLine();
            }

    }
}
