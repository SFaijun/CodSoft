import java.util.Random;
import java.util.Scanner;
public class Numbergame {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   //generating a random number
   Random random = new Random();
   int score=0;
   boolean playAgain;

   do{
    int numberToGuess = random.nextInt(100) + 1; // Number between 1 and 100
    int numberOfAttempts = 8; // Limit number of attempts
    boolean guessedCorrectly = false;

    System.out.println("A new round has started! You have " + numberOfAttempts + " attempts to guess the number between 1 and 100.");

    for (int i = 1; i <= numberOfAttempts; i++) {
        System.out.print("Attempt " + i + ": Enter your guess: ");
        int  Playerguess = sc.nextInt();
     
    if(Playerguess==numberToGuess){
            System.out.println("Your Guess is Correct");
            guessedCorrectly=true;
            score++; 
            break;   
        }
        else if(Playerguess<numberToGuess){
            System.out.println("Your Guess is low");
        }
        else{
            System.out.println("Your Guess is high");
        }
    }
        if(!guessedCorrectly){
            System.out.println("Sorry,The maximum number of attemptes has been raeched .The correct number is :" +numberToGuess);
        }
        System.out.println("Your current score is: " + score);

        System.out.print("Do you want to play another round? (yes/no): ");
        sc.nextLine();
        String userResponse = sc.nextLine();
        playAgain = userResponse.equalsIgnoreCase("yes");

    } while (playAgain);

    System.out.println("Thank you for playing! Your final score is: " + score);
    sc.close();
}
}

   





    

