import java.util.Random;
import java.util.Scanner;

public class numGuess{
    public static Integer guesses = 10;
    public static Boolean winStatus = false;
    public static final Scanner input = new Scanner(System.in);

    public static void slowPrint(String message){
        char[] charArray = message.toCharArray();
        try{
            for (int i = 0; i < charArray.length; i++){
                System.out.print(charArray[i]);
                Thread.sleep(25);
            }
        } catch (InterruptedException ie) {
            System.out.println("InterruptedException: Message was interrupted, Ending Program.");
            System.exit(0);
        }
    }

    public static void intro(){
        slowPrint("Welcome to the number guessing game.\n\nRules:\nEnter a number in between 1-100, you will be told if it is higher or lower, you will then be prompted to give another guess. \nYou win by correctly guessing the number, and you lose if you use up all your attempts\n\nSelect a Difficulty(enter number):\n1. Easy(10 Guesses)\n2. Medium(5 Guesses)\n3. Hard(3 Guesses)\n>");
        switch(input.nextInt()){
            case 1 -> {guesses = 10;} //vscode told me to use the arrow, idk why
            case 2 -> {guesses = 5;}
            case 3 -> {guesses = 3;}
            default -> {
                slowPrint("Invalid Input: Ending Program");
                System.exit(0);
            }
        }
        game();
    }

    public static void game(){
        Random rand = new Random();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int initialGuessCount = guesses + 1;
        int numToGuess = rand.nextInt(1, 101);
        for (int i = guesses; i > 0; i--){
            System.out.print("Guess a number:\n>");
            int x = input.nextInt();
            if (x == numToGuess){
                winStatus = true;
                end(initialGuessCount - i);
            } else {
                System.out.println((x > numToGuess) ? "Lower\n" : "Higher\n");
            }
        }
        end(initialGuessCount);
    }

    public static void end(int attempts){
        slowPrint((winStatus) ? "Congratulations, it took you "+ attempts +" attempt(s)" : "You Lost :(");
        System.exit(0);
    }

    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        intro();
    }
}