package app;
import package1.Person;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int i = 10;
        i++;
        System.out.println("The number is " + i);
        Person p1 = new Person();
        p1.greet();
    }
}
