package teachingJava;

public record i(String name, Integer age) {
    public static int birthYear(int age){
        return 2024 - age;
    }
}
