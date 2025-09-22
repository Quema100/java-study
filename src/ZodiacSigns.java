import java.util.InputMismatchException;
import java.util.Scanner;

public class ZodiacSigns {
    public static void main(String[] args) {
        int year;
        boolean validYear = false;
        Scanner scanner = new Scanner(System.in);
        while (!validYear) {
            try {
                System.out.print("출생연도를 입력하세요: ");
                year = scanner.nextInt();

                switch (year % 12) {
                    case 0 -> System.out.println("원숭이 띠");
                    case 1 -> System.out.println("딝띠");
                    case 2 -> System.out.println("개띠");
                    case 3 -> System.out.println("돼지띠");
                    case 4 -> System.out.println("쥐띠");
                    case 5 -> System.out.println("소띠");
                    case 6 -> System.out.println("호랑이띠");
                    case 7 -> System.out.println("토끼띠");
                    case 8 -> System.out.println("용띠");
                    case 9 -> System.out.println("뱀띠");
                    case 10 -> System.out.println("말띠");
                    case 11 -> System.out.println("양띠");
                }
                validYear = true;
                scanner.close();
            } catch (InputMismatchException err) {
                System.out.println("올바른 출생 연도를 입력하세요.");
                scanner.nextLine();
                validYear = false;
            }
        }
    }
}
