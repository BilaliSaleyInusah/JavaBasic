import java.util.Scanner;

public class helloWorld {

    public static void main(String[] args) {

        Scanner readme = new Scanner(System.in);

        System.out.print("What is your name : ");
        String name = readme.next();

        System.out.print("what is your year of birth (Eg. 1999, 2000) : ");
        int year = readme.nextInt();

        System.out.println(" hello " + name.toUpperCase());
        
        int age = 2_022 - year;
        System.out.println("You are " + age + " years old");

        



    }

} 