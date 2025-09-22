import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String userHand, computerHand;
        String[] hands = {"가위", "바위", "보"};
        boolean found = false;
        int rnd = (int) (Math.random()*hands.length);
        Scanner scanner = new Scanner(System.in);
        while (!found) {
            System.out.print("가위/바위/보 중 하나를 선택해주세요: ");
            userHand = scanner.nextLine();
            computerHand = hands[rnd];

            for (String hand : hands) {
                if (hand.equals(userHand)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("컴퓨터가 " + computerHand + "를 내었습니다.");

                if (
                        (computerHand.equals("가위") && userHand.equals("보")) ||
                        (computerHand.equals("바위") && userHand.equals("가위")) ||
                        (computerHand.equals("보") && userHand.equals("바위"))
                )
                    System.out.println("컴퓨터가 이겼습니다.");
                else if (
                        (computerHand.equals("보") && userHand.equals("가위")) ||
                                (computerHand.equals("가위") && userHand.equals("바위")) ||
                                (computerHand.equals("바위") && userHand.equals("보"))
                )
                    System.out.println("사용자가 이겼습니다.");
                else
                    System.out.println("무승부");

                scanner.close();
            } else {
                System.out.println("입력하신 값이 이상합니다.");
            }
        }
    }
}
