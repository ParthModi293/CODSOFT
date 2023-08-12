package GuessNumber;

import java.util.Scanner;

public class GuessNumGame {

    public  void guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());

        //for rounds..
        int K = 10;
        int i, guess;

        System.out.println("A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");

        for (i = 0; i < K; i++) {

            System.out.println("Guess the number:");
            guess = sc.nextInt();

            // If the number is guessed
            if (number == guess) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            }
            else if (number > guess && i != K - 1) {
                System.out.println(
                        "The number is greater than " + guess);
            }
            else if (number < guess && i != K - 1) {
                System.out.println("The number is less than " + guess);
            }
        }

        if (i == K) {
            System.out.println(
                    "You have finished your " + K + " trials.");

            System.out.println("The number was " + number);
        }
    }


    public static void main(String args[])
    {

        GuessNumGame g = new GuessNumGame();
        g.guessingNumberGame();
    }
}
