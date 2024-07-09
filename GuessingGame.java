import java.util.*;
public class GuessingGame{
    public static void main(String[] args) {
        guessNumberGame();
    }

    public static void guessNumberGame(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("I have chosen a random number between 1 and 100.");
        System.out.println("Try to guess the number.");

        int secretNumber =  random.nextInt(100) + 1;
        int attempts =0;

        int userGuess;

        while (true) {
            try{
                System.out.println("Enter your guess(between 1 and 100) :");
                userGuess = Integer.parseInt(sc.nextLine());
                attempts++;

                if(userGuess<1 || userGuess > 100){
                    System.out.println("Please enter a number within the range 1 and 100.");
                    continue;
                }

                if (userGuess < secretNumber) {
                    System.out.println("Too low! Try again.");
                }
                else if (userGuess > secretNumber) {
                    System.out.println("Too high! Try again.");
                }
                else{
                    System.out.println("Congratulations! You guessed the number" + secretNumber + "correctly!");
                    System.out.println("It took you" +attempts+"attempts to guess the number.");
                    break;
                }

            }
            catch(NumberFormatException e){
                System.out.println("Invalid input. Please enter a valid number.");
            }
            
        }
        sc.close();
    }
}