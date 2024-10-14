import java.util.Scanner;

public class teaching1246{
    
    public static void intro(){
        Scanner input = new Scanner(System.in);
        String message = "Pick a lesson:\n1. Data Types\n2. Boolean Operators\n-->";
        char[] charArray = message.toCharArray();
        try{
            for (int i = 0; i < charArray.length; i++){
                System.out.print(charArray[i]);
                Thread.sleep(25);
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
        String message = "\nDo you want to return to the main menu?:\n1. Yes\n2. No(Exit Program)";
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
                System.out.println();
                intro();
                break;
            case 2:
                System.exit(0);
            default:
                System.out.println();
                System.out.println("Invalid Input: Returning to Intro");
                intro();
                break;
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        input.close();
    }

    public static void dataTypes(){
        // Scanner input = new Scanner(System.in);
        System.out.println();
        
        String a = "hello"; //multiple characters
		Integer b = 256; //integers
		Boolean c = true; //true or false
		char d = 'z'; //single ASCII character
		Double e = 26.426; //decimal values
        String message = "Data types are how computer can store various kinds of data. For example: \nString: "+a+"\nInteger: "+b+"\nBoolean: "+c+"\nASCII Character: "+d+"\nDouble(Decimal): "+e+"\n";
        char[] charArray = message.toCharArray();
        try{
            for (int i = 0; i < charArray.length; i++){
                System.out.print(charArray[i]);
                Thread.sleep(50);
            }
        } catch (InterruptedException ie) {
            System.out.println("InterruptedException: Message was interrupted, restarting transition block.");
            transition();
        }
        
        transition();
        // input.close();

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

        String singleLogicGate = "Yes Gate:              Not Gate(!):\ninput  | output |      input  | output |\n-------+--------|     --------+--------|\n"+true1+"   |    "+out1+"   |      "+true2+"   |    "+out3+"   |\n"+false1+"  |    "+out2+"   |      "+false1+"  |    "+out4+"   |";
        char[] charArray = singleLogicGate.toCharArray();
        try{
            for (int i = 0; i < charArray.length; i++){
                System.out.print(charArray[i]);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: Message was interrupted, restarting block.");
            booleanOperators();
        }
        System.out.println();
        System.out.println();

        //-----------------------------------------------------and gate-----------------------------------------------------
        Boolean[][] options = {{false1, false2}, {true1, false1}, {false1, true1}, {true1, true2}};
        int[] outputs = {out1, out2, out3, out4};

        for(int i = 0; i < 4; i++){
            if (options[i][0] && options[i][1]){
                outputs[i] = 1;
            } else {
                outputs[i] = 0;
            }
        }

        String andTable = "     input      | output |\n   a   |    b   |        |\n-------+--------+--------|\n "+options[0][0]+" | "+options[0][1]+"  |    "+outputs[0]+"   |\n "+options[1][0]+"  | "+options[1][1]+"  |    "+outputs[1]+"   |\n "+options[2][0]+" | "+options[2][1]+"   |    "+outputs[2]+"   |\n "+options[3][0]+"  | "+options[3][1]+"   |    "+outputs[3]+"   |";

        charArray = ("AND Gate:\n"+andTable).toCharArray();
        try{
            for (int i = 0; i < charArray.length; i++){
                System.out.print(charArray[i]);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: Message was interrupted, restarting block.");
            booleanOperators();
        }

        System.out.println();

        //-----------------------------------------------------or gate-----------------------------------------------------
        for(int i = 0; i < 4; i++){
            if (options[i][0] || options[i][1]){
                outputs[i] = 1;
            } else {
                outputs[i] = 0;
            }
        }

        String orTable = "     input      | output |\n   a   |    b   |        |\n-------+--------+--------|\n "+options[0][0]+" | "+options[0][1]+"  |    "+outputs[0]+"   |\n "+options[1][0]+"  | "+options[1][1]+"  |    "+outputs[1]+"   |\n "+options[2][0]+" | "+options[2][1]+"   |    "+outputs[2]+"   |\n "+options[3][0]+"  | "+options[3][1]+"   |    "+outputs[3]+"   |";

        System.out.println();
        charArray = ("OR Gate:\n"+orTable).toCharArray();
        try{
            for (int i = 0; i < charArray.length; i++){
                System.out.print(charArray[i]);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: Message was interrupted, restarting block.");
            booleanOperators();
        }

        System.out.println();
        System.out.println();

        //-----------------------------------------------------xor gate-----------------------------------------------------
        for(int i = 0; i < 4; i++){
            if (options[i][0] ^ options[i][1]){
                outputs[i] = 1;
            } else {
                outputs[i] = 0;
            }
        }

        String xorTable = "     input      | output |\n   a   |    b   |        |\n-------+--------+--------|\n "+options[0][0]+" | "+options[0][1]+"  |    "+outputs[0]+"   |\n "+options[1][0]+"  | "+options[1][1]+"  |    "+outputs[1]+"   |\n "+options[2][0]+" | "+options[2][1]+"   |    "+outputs[2]+"   |\n "+options[3][0]+"  | "+options[3][1]+"   |    "+outputs[3]+"   |";

        System.out.println();
        charArray = ("XOR Gate:\n"+xorTable).toCharArray();
        try{
            for (int i = 0; i < charArray.length; i++){
                System.out.print(charArray[i]);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: Message was interrupted, restarting block.");
            booleanOperators();
        }

        System.out.println();
        System.out.println();


        //-----------------------------------------------------nand gate-----------------------------------------------------
        for(int i = 0; i < 4; i++){
            if (!(options[i][0] && options[i][1])){
                outputs[i] = 1;
            } else {
                outputs[i] = 0;
            }
        }

        String nandTable = "     input      | output |\n   a   |    b   |        |\n-------+--------+--------|\n "+options[0][0]+" | "+options[0][1]+"  |    "+outputs[0]+"   |\n "+options[1][0]+"  | "+options[1][1]+"  |    "+outputs[1]+"   |\n "+options[2][0]+" | "+options[2][1]+"   |    "+outputs[2]+"   |\n "+options[3][0]+"  | "+options[3][1]+"   |    "+outputs[3]+"   |";

        System.out.println();
        charArray = ("NAND Gate:\n"+nandTable).toCharArray();
        try{
            for (int i = 0; i < charArray.length; i++){
                System.out.print(charArray[i]);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: Message was interrupted, restarting block.");
            booleanOperators();
        }

        System.out.println();
        System.out.println();

        //-----------------------------------------------------nor gate-----------------------------------------------------
        for(int i = 0; i < 4; i++){
            if (!(options[i][0] || options[i][1])){
                outputs[i] = 1;
            } else {
                outputs[i] = 0;
            }
        }

        String norTable = "     input      | output |\n   a   |    b   |        |\n-------+--------+--------|\n "+options[0][0]+" | "+options[0][1]+"  |    "+outputs[0]+"   |\n "+options[1][0]+"  | "+options[1][1]+"  |    "+outputs[1]+"   |\n "+options[2][0]+" | "+options[2][1]+"   |    "+outputs[2]+"   |\n "+options[3][0]+"  | "+options[3][1]+"   |    "+outputs[3]+"   |";

        System.out.println();
        charArray = ("NOR Gate:\n"+norTable).toCharArray();
        try{
            for (int i = 0; i < charArray.length; i++){
                System.out.print(charArray[i]);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: Message was interrupted, restarting block.");
            booleanOperators();
        }

        System.out.println();
        System.out.println();

        //-----------------------------------------------------xnor gate-----------------------------------------------------
        for(int i = 0; i < 4; i++){
            if (!(options[i][0] ^ options[i][1])){
                outputs[i] = 1;
            } else {
                outputs[i] = 0;
            }
        }

        String xnorTable = "     input      | output |\n   a   |    b   |        |\n-------+--------+--------|\n "+options[0][0]+" | "+options[0][1]+"  |    "+outputs[0]+"   |\n "+options[1][0]+"  | "+options[1][1]+"  |    "+outputs[1]+"   |\n "+options[2][0]+" | "+options[2][1]+"   |    "+outputs[2]+"   |\n "+options[3][0]+"  | "+options[3][1]+"   |    "+outputs[3]+"   |";

        System.out.println();
        charArray = ("XNOR Gate:\n"+xnorTable).toCharArray();
        try{
            for (int i = 0; i < charArray.length; i++){
                System.out.print(charArray[i]);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: Message was interrupted, restarting block.");
            booleanOperators();
        }

        System.out.println();
        transition();
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
                Thread.sleep(25);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: Message was interrupted, restarting transition block.");
            transition();
        }
        intro();  
    }
}