import java.util.Scanner;
import java.util.Arrays;

public class uom{

    public static void intro(){
        Scanner input = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        String message = "Welcome to the unit converter.\nPick a unit to convert from, a unit to convert to, and a number of units to convert\n\n1. Distance\n2. Weight\n3. Temperature\n>";
        char[] charArray = message.toCharArray();
        try{
            for (int i = 0; i < charArray.length; i++){
                System.out.print(charArray[i]);
                Thread.sleep(25);
            }
        } catch (InterruptedException ie) {
            System.out.println("InterruptedException: Message was interrupted, restarting transition block.");
            intro();
        }
        int userChoice = input.nextInt();
        switch(userChoice){
            case 1:
                distance();
                break;
            case 2:
                weight();
                break;
            case 3:
                temperature();
                break;
            default:
                System.out.println("Invalid Input, Restarting Section");
                intro();
                break;
        }
        // input.close();
    }

    public static int choice1;
    public static int choice2;

    public static void distance(){
        //mm   , cm     , inches   , feet  , yard      , m     , km      , mile
        //mm/10, cm/2.54, inches/12, feet/3, yard/1.094, m/1000, km/1.609
        Scanner input = new Scanner(System.in);

        int[] units = new int[2];
        String distanceOptions = "1. mm\n2. cm\n3. inches\n4. foot\n5. yard\n6. m\n7. km\n8. mile\n>";
        char[] charArray = distanceOptions.toCharArray();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        for(int i = 0; i < units.length; i++){
            try{
                for (int j = 0; j < charArray.length; j++){
                    System.out.print(charArray[j]);
                    Thread.sleep(25);
                }
            } catch (InterruptedException ie) {
                System.out.println("InterruptedException: Message was interrupted, restarting transition block.");
                intro();
            }
            units[i] = input.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

        input.close();
        System.out.println(Arrays.toString(units));
        System.exit(0);
    }

    public static void weight(){
        //mg     , g      , oz   , lbs      , kg
        //mg/1000, g/28.35, oz/16, lbs/2.205
        System.exit(0);
    }

    public static void temperature(){
        //Celcius, Farenheit, Kelvin
        System.exit(0);
    }

    public static void main(String[] args){
        intro();
    }
}

