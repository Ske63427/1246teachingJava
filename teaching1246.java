import java.util.Scanner;

public class teaching1246{

    public static void intro(){
        Scanner input = new Scanner(System.in);
        String message = "Pick a lesson:\n1. Data Types\n2. Boolean Operators\n-->";
        char[] charArray = message.toCharArray();
        try{
            for (int i = 0; i < charArray.length; i++){
                System.out.print(charArray[i]);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: Message was interrupted, restarting transition block.");
            transition();
        }
        int userChoice = input.nextInt();
        // input.close();

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
        String message = "Do you want to return to the main menu?:\n1. Yes\n2. No(Exit Program)";
        char[] charArray = message.toCharArray();
        try{
            for (int i = 0; i < charArray.length; i++){
                System.out.print(charArray[i]);
                Thread.sleep(50);
            }
            System.out.print("\n-->");
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: Message was interrupted, restarting transition block.");
            transition();
        }
        int userChoice = input.nextInt();

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
        System.out.print("\033[H\033[2J");
        System.out.flush();
        input.close();
    }

    public static void dataTypes(){
        // Scanner input = new Scanner(System.in);

        System.out.println("Data types ways in which a computer can store various kinds of data. For example: ");
        String a = "hello"; //multiple characters
		Integer b = 254; //integers
		Boolean c = true; //true or false
		char d = 'z'; //single ASCII character
		Double e = 26.426; //decimal values

        System.out.println("String: "+a+"\nInteger: "+b+"\nBoolean(True or False): "+c+"\nASCII Character: "+d+"\nDouble(Decimal): "+e+"\n");
        // input.close();
        transition();

    }

    public static void booleanOperators(){
        Scanner input = new Scanner(System.in);
        Boolean true1 = true;
        Boolean false1 = false;
        Boolean true2 = true;
        Boolean false2 = false;
        int out1, out2, out3, out4;

        //single input gates (yes and not)
        if (true1 == true){
            out1 = 1;
        } else {
            out1 = 0;
        }
        if (false1 == false){
            out2 = 0;
        } else {
            out2 = 1;
        }

        if (!true2 == false){
            out3 = 0;
        } else {
            out3 = 1;
        }
        if (!false2 == true){
            out4 = 1;
        } else {
            out4 = 0;
        }
        System.out.println();

        System.out.println("Yes Gate:       |      Not Gate(!):");
        System.out.println("input  | output |      input  | output |");
        System.out.println("------------------     -----------------");
        System.out.println(true1+"   |    "+out1+"   |      "+true2+"   |    "+out3+"   |");
        System.out.println(false1+"  |    "+out2+"   |      "+false1+"  |    "+out4+"   |");
        System.out.println();

        System.out.println();

        //and gate

        Boolean[][] options = {{false1, false2}, {true1, false1}, {false1, true1}, {true1, true2}};
        int[] outputs = {out1, out2, out3, out4};

        for(int i = 0; i < 4; i++){
            if (options[i][0] && options[i][1]){
                outputs[i] = 1;
            } else {
                outputs[i] = 0;
            }
        }

        System.out.println("And Gate:");
        System.out.println("      input     | output |");
        System.out.println("   a   |    b   |        |");
        System.out.println("--------------------------");
        System.out.println(" "+options[0][0]+" | "+options[0][1]+"  |    "+outputs[0]+"   |");
        System.out.println(" "+options[1][0]+"  | "+options[1][1]+"  |    "+outputs[1]+"   |");
        System.out.println(" "+options[2][0]+" | "+options[2][1]+"   |    "+outputs[2]+"   |");
        System.out.println(" "+options[3][0]+"  | "+options[3][1]+"   |    "+outputs[3]+"   |");

        System.out.println();
        System.exit(0);

        

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
        input.close();
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //System.out.println("Hello! This program is designed to teach you the basics of Java\n");
        String message = "Hello! This program is designed to teach you the basics of Java\n";
        char[] charArray = message.toCharArray();
        try{
            for (int i = 0; i < charArray.length; i++){
                System.out.print(charArray[i]);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: Message was interrupted, restarting transition block.");
            transition();
        }
        intro();  
    }
}