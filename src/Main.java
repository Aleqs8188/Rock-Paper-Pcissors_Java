import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];
            String playerMove, playAgain;
            while (true) {
                System.out.println("Please enter your move (r, p or s)");
                playerMove = scanner.nextLine().toLowerCase();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                } else if (playerMove.equals("exit")) {
                    System.out.println("Game over");
                    return;
                }
                System.out.println(playerMove + " is not valid move...");
            }
            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("Loose...");
                } else if (computerMove.equals("s")) {
                    System.out.println("You win!!!");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("s")) {
                    System.out.println("Loose...");
                } else if (computerMove.equals("r")) {
                    System.out.println("You win!!!");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("r")) {
                    System.out.println("Loose...");
                } else if (computerMove.equals("p")) {
                    System.out.println("You win!!!");
                }
            }
            System.out.println("Play again \"y/n\"");
            playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("y")) {
                return;
            }
        }
    }
}
