import java.util.InputMismatchException;
import java.util.Scanner;

public class CurrencyBreakdown {
    public static void main(String[] args) {
        int money , count50k, count10k, count5k, count1k;

        boolean isInt = false;
        Scanner scanner = new Scanner(System.in);

        while (!isInt)
            try {
                System.out.print("금액을 입력하세요: ");
                money = scanner.nextInt();

                count50k = money/50000;
                money %= 50000;
                count10k = money/10000;
                money %= 10000;
                count5k = money/5000;
                money %= 5000;
                count1k = money/1000;

                System.out.println(
                        "5만원 "+count50k+"장\n"+
                        "1만원 "+count10k+"장\n"+
                        "5천원 "+count5k+"장\n"+
                        "1천원 "+count1k+"장"
                );
                isInt = true;
                scanner.close();
            } catch (InputMismatchException err) {
                System.out.println("올바른 금액을 입력하세요.");
                scanner.nextLine();
            }
    }
}
