import java.util.Scanner;
import java.util.Random;

public class Stone_Paper_Scissor_Game {
    // 0 for rock
    // 1 for paper
    // 2 for Scissor
    public static void main(String[] args) {
        System.out.println("Enter The Number");

        int BotInput = 0;
        for (int i = 0; i <= 5; i++) {
            Scanner sc = new Scanner(System.in);
            int UserInput = sc.nextInt();
            Random Ri = new Random();
            BotInput = Ri.nextInt(3);

            switch (BotInput) {
                case 0:
                    System.out.println("Computer chooses the 1:rock");
                    break;
                case 1:
                    System.out.println("Computer chooses the 2:paper");
                    break;
                case 2:
                    System.out.println("Computer chooses the 3:Scissor");
                    break;
            }

            if (UserInput == BotInput) {
                System.out.println("Match Is DRAW");
            } else if (UserInput == 1 && BotInput == 0 || UserInput == 0 && BotInput == 2 || UserInput == 2 && BotInput == 1) {
                System.out.println("User WINS the Match");
            } else {
                System.out.println("Bot WINS the match");
            }
          }
        }
      }



