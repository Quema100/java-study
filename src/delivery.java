import java.util.Scanner;

public class delivery {
    public static void main(String[] args) {
        String personAddress, personName;
        double weight;

        Scanner scanner = new Scanner(System.in);

        System.out.println("받는 사람: ");
        personName = scanner.nextLine();
        System.out.println("받는 사람 주소: ");
        personAddress = scanner.nextLine();
        System.out.println("배송 불건 무게(g): ");
        weight = scanner.nextDouble();

        System.out.println("받는 사람:" + personName + "\n주소:" + personAddress +"\n배송비:" + weight*5 + "(원)");


    }
}
