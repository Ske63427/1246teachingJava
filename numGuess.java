import java.util.Random;
import java.util.Scanner;

public class numGuess{
    public static Byte guesses = 10;
    public static final Scanner input = new Scanner(System.in);

    public static void slowPrint(String message){
        try{
            for (char x : message.toCharArray()){
                System.out.print(x);
                Thread.sleep(10);
            }
        } catch (InterruptedException ie) {
            System.out.println("InterruptedException: Message was interrupted, Ending Program.");
            System.exit(0);
        }
    }

    public static void intro(){
        slowPrint("Welcome to the number guessing game.\n\nRules:\nEnter a number in between 1-100, you will be told if it is higher or lower, you will then be prompted to give another guess. \nYou win by correctly guessing the number, and you lose if you use up all your attempts\n\nSelect a Difficulty(enter number):\n1. Easy(10 Guesses)\n2. Medium(5 Guesses)\n3. Hard(3 Guesses)\n>");
        switch(input.nextByte()){
            case 1 -> guesses = 10; //vscode told me to use the arrow, idk why
            case 2 -> guesses = 5;
            case 3 -> guesses = 3;
            default -> {
                System.out.println("Invalid Input: Ending Program");
                System.exit(0);
            }
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        game();
    }

    public static void game(){
        Random rand = new Random();
        int numToGuess = rand.nextInt(1, 101);
        for (byte i = 1; i <= guesses; i++){
            System.out.print("Guess a number:\n>");
            int x = input.nextByte(); // if i dont assign input.nextInt() to a variable, the program freezes
            if (x == numToGuess) end(i, true);
            else System.out.println((x > numToGuess) ? "Lower\n" : "Higher\n");
        }
        end((byte) 0, false);
    }

    public static void end(byte attempts, boolean winStatus){
        slowPrint((winStatus) ? "Congratulations, it took you "+ attempts +" attempt(s)" : "You Lost :(");
        System.exit(0);
    }

    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        intro();
    }
}