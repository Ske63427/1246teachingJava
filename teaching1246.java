import java.util.Scanner;
// \u001b[<n>m

public class teaching1246{
    
    public static void intro(){
        Scanner input = new Scanner(System.in);
        String message = "Pick a lesson:\n1. Data Types\n2. Boolean Operators\n3. Conditionals\n4. Comparison Operators\n5. Arithmetic Operators\n-->";
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
            case 3:
                conditionals();
                break;
            case 4:
                comparisonOperators();
                break;
            case 5:
                arithmeticOperators();
                break;
            default:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Enter a number from the list above");
                intro();
        }
        input.close();
    }

    public static void transition(){
        Scanner input = new Scanner(System.in);
        String message = "\nDo you want to return to the main menu?:\n1. Yes\n2. No(Exit Program)";
        char[] charArray = message.toCharArray();
        try{
            for (int i = 0; i < charArray.length; i++){
                System.out.print(charArray[i]);
                Thread.sleep(25);
            }
            System.out.print("\n-->");
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: Message was interrupted, restarting transition block.");
            transition();
        }
        int userChoice = input.nextInt();

        switch (userChoice) {
            case 1:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                intro();
                break;
            case 2:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.exit(0);
            default:
                System.out.print("\033[H\033[2J");
                System.out.flush();
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
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        String a = "hello"; //multiple characters
		Integer b = 256; //integers
		Boolean c = true; //true or false
		char d = 'z'; //single ASCII character
		Double e = 26.426; //decimal values
        String message = "Primitive data types are how computer can store various kinds of data. For example: \nString: "+a+"\nInteger: "+b+"\nBoolean: "+c+"\nASCII Character: "+d+"\nDouble: "+e+"\n\nThere are also arrays, which are non primitive data structures that hold multiple primitive data values\n{0, 1, 2, 3} //array of integers \n{'a', 'b', 'c'} //array of chars\nI wont be covering data structures in these lessons, but if you are going into computer science after high school, I would reccomend learning about them now.\n\nArrays can be written many ways:\n`primitiveVariableType`[] = `variableName`{item1, item2, ..., item n};\n`primitiveVariableType`[] = `variableName`[arrayLength] //note: you will have to declare every value in the array if you use this method\nEach Item in an array is indexed starting at 0; meaning if you called `variableName`[0], you would call the first item in the array.\n\nThere are also 2D arrays, which can be thought of like tables/spreadsheets. They can be written just like normal arrays, but instead of 1 set of square brackets, they have 2. \nA 2D array is an array of arrays: {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}\n                                    0  1  2    0  1  2    1  2  3\n                                    0          1          2\n";
        char[] charArray = message.toCharArray();
        try{
            for (int i = 0; i < charArray.length; i++){
                System.out.print(charArray[i]);
                Thread.sleep(25);
            }
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            System.out.println("InterruptedException: Message was interrupted, restarting transition block.");
            transition();
        }
        
        transition();
        // input.close();

    }

    public static void conditionals(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        String message = "Conditional statements are programming statements that perform different computations or actions or return different values depending on the value of a condition. \n\nThere are 3 kinds of conditionals:\n1. Structured If\n2. Switch Case\n3. Ternary Operator\n\nA structured if statement is the most basic kind of conditional. It is written like this:\n\nif (condition) {\n    //code to be executed if condition is met\n} else if (condition) {\n    //code to be executed if this condition is met\n} else {\n    //code to be executed if all the previous if/else-if statements are false\n}\n\nYou should not write code with really long if statements; generally speaking, try to avoid using structured if statements\n\nA switch-case statement is written like this:\nswitch (variable){\n    case 1:\n        //code to be executed in case 1\n    case n:\n        //code to be executed in case n\n    default:\n        //if the variable is not equal to any of the previous cases, this code will be executed\n}\n\nNote: your variable in the switch case statement can only be a Byte, Short, Character, Integer, or Enum\n";
        char[] charArray = message.toCharArray();
        try{
            for (int i = 0; i < charArray.length; i++){
                System.out.print(charArray[i]);
                Thread.sleep(25);
            }
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            System.out.println("InterruptedException: Message was interrupted, restarting transition block.");
            transition();
        }
        
        transition();
    }

    public static void booleanOperators(){
        Scanner input = new Scanner(System.in);

        System.out.println("Boolean operators (a.k.a Logic Gates) are used to see what boolean inputs result in certain boolean output(true or false)");
        System.out.print("Would you like to:\n1. See every logic gate table\n2. See the lesson\n-->");
        int userChoice = input.nextInt();
        switch (userChoice) {
            case 1:
                booleanTables();
                transition();
                break;
            case 2:
                break;
            default:
                booleanOperators();
                break;
        }
        System.out.println();
        System.out.println("For this lesson, you will be creating your own program (because honestly I could not think of a lesson for data types lol)\n\n");

        transition();
        input.close();
    }
    
    public static void booleanTables(){
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
    }
    
    public static void comparisonOperators(){
        //code
    }

    public static void arithmeticOperators(){
        //code
    }

    public static void loops(){
        //code
    }
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
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