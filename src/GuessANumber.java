import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random randomNumber = new Random();

        int computerNumber = randomNumber.nextInt(100);


        int maxAttempts = 10;
        int currentAttempts = 0;

        System.out.println("Welcome to the Guess a Number game!");
        while (true) {

            if (currentAttempts == maxAttempts) {
                System.out.println("Sorry you've run out of attempts. The correct number was: " + computerNumber);
                return;
            }

            System.out.print("Guess a number (1-100): ");
            String playerInput = scanner.nextLine();
            int playerNumber;
            boolean isValid = true;


            for (int i = 1; i < playerInput.length(); i++) {


                if (isValid) {

                    try {
                        playerNumber = Integer.parseInt(playerInput);


                        if (playerNumber == computerNumber) {
                            currentAttempts++;
                            System.out.println("Congratulations! You guessed the number with " + currentAttempts + " attempts.");
                            isValid = false;
                            return;
                        } else if (playerNumber > computerNumber) {
                            System.out.println("Wrong number! Too High!");
                            currentAttempts++;
                            System.out.println("Attempts left: " + (maxAttempts - currentAttempts));
                            break;
                        } else if (playerNumber < computerNumber) {
                            System.out.println("Wrong number! Too Low!");
                            currentAttempts++;
                            System.out.println("Attempts left: " + (maxAttempts - currentAttempts));
                            break;
                        } else {
                            System.out.println("Invalid input.Please enter a valid number.");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input.Please enter a valid number.");
                        break;
                    }

                }

            }


        }


    }
}

