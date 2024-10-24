package teachingJava;
import java.util.Arrays;

enum h {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class example{
    public static void main(String[] args) {
        //primitive data types
        int a = 123;
        float b = 5.25f;
        double c = 3.141592653;
        boolean d = true; 
        char e = 'z'; //you must use single quotes

        //non primitive data types
        String f = "Hello World";
        int[] g = {1, 2, 3, 4, 5}; 
        h day = h.FRIDAY;
        i person = new i( "John",35);
        // j number = new j();
        System.out.println(person.name()+"'s birth Year "+i.birthYear(35)+"\n");
        System.out.println("a: "+a+"\nb: "+b+"\nc: "+c+"\nd: "+d+"\ne: "+e+"\nf: "+f+"\ng: "+Arrays.toString(g)+"\nh: "+day+"\ni: "+person+"\nj: "+j.num()+"\n");
    }
}

