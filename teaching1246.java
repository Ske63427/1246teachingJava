import java.util.Scanner;

public class teaching1246{

    public static void intro(){
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a lesson:\n1. Data Types\n2. Boolean Operators");
        int userChoice = input.nextInt();
        input.close();

        switch (userChoice){
            case 1:
                dataTypes();
                break;
            case 2:
                booleanOperators();
                break;
            default:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Enter a number from the list above");
                intro();
        }
        
    }

    public static void transition(){
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to return to the main menu?:\n1. Yes\n2. No(Exit Program)");
        int userChoice = input.nextInt();
        input.close();

        switch (userChoice) {
            case 1:
                intro();
                break;
            case 2:
                System.exit(0);
            default:
                System.out.println("Invalid Input: Returning to Intro");
                break;
        }
    }

    public static void dataTypes(){
        Scanner input = new Scanner(System.in);

        String a = "hello"; //multiple characters
		Integer b = 254; //integers
		Boolean c = true; //true or false
		char d = 'z'; //single ASCII character
		Double e = 26.426; //decimal values

        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e);


    }

    public static void booleanOperators(){
        Boolean in1;
        Boolean in2;
        int out1, out2, out3, out4;

        //yes gate
        // if (in1 == true){
        //     System.out.println("input is true");
        // } else {
        //     System.out.println("input is false");
        // }
        // if (in1 == false){
        //     System.out.println("b is false");
        // } else {
        //     System.out.println("b is true");
        //}
        System.out.println();

        // input | output |
        // -----------------
        //   0   |    0   |
        //   1   |    1   |

        // System.out.println(" input | output |");
        // System.out.println("-----------------");
        // System.out.println("//   "+in1+"   |    "+out1+"   |");
        // System.out.println("//   "+in2+"   |    "+out2+"   |");

        //not gate
        // if (!in1 == false){
        //     System.out.println("a is false");
        // } else {
        //     System.out.println("a is true");
        // }
        // if (!in1 == true){
        //     System.out.println("b is true");
        // } else {
        //     System.out.println("b is false");
        // }
        System.out.println();

        // input | output
        //   0   |    1   
        //   1   |    0

        //and gate

        //or gate

        //xor gate

        //nand gate

        //nor gate

        //xnor gate

        // if (a && b){ //and gate
        //     //false
        // } else if (a || b){ //or gate
        //     //true
        // } else if (!a){ //not gate
        //     //false
        // }

        //others:
        // ^ = xor
        // !(a && b) = nand
        // !(a || b) = nor
        // !(a ^ b) = xnor
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Welcome. This program is designed to teach you the basics of Java\n");
        intro();  
    }
}