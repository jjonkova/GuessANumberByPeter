import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        int computerNumber = randomNumber.nextInt(100);

        while (true) {
            System.out.print("Guess a number (1-100): ");
            String playerInput = scanner.nextLine();
            int playerNumber;

            // boolean isValid = int.TryParse(playerInput, out int playerNumber); // ???
           //boolean isValid1 = Boolean.parseBoolean(playerInput);
            // boolean isValid =

            if () {
                if (playerNumber == computerNumber) {
                    System.out.println("You guessed it!");
                    break;
                } else if (playerNumber > computerNumber) {
                    System.out.println("Too High");
                } else {
                    System.out.println("Too Low");
                }
            }
            else {
                System.out.println("Invalid input.");
            }
        }
    }

    public int tryParseInt(String playerInput, int playerNumber) {
        try {
            return Integer.parseInt(playerInput);
        } catch (NumberFormatException e) {
            return playerNumber;
        }
    }
}