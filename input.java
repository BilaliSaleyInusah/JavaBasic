import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("What your date of birth : ");

        boolean hasNextInt = scan.hasNextInt();
        if (hasNextInt) {
            int date = scan.nextInt();
            scan.nextLine();
    
            System.out.println("What is your name : ");
            String name = scan.nextLine();
            int age = 2022 - date;
            
            if (age >= 0 && age <= 100) {
                System.out.println("Mr/Mrs " + name + ", you are " + age + " years old.");
            } else {
                System.out.println("Mr/Mrs " + name + ", you are having Invalide age");
            }
        } else {
            System.out.println("You entered a wrong data type please ( Integer value only )");
        }

       
        scan.close();

    }
}
