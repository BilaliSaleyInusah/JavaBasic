import java.util.Scanner;

public class inputChallenge {
    
    public static void main(String[] args) {
        
        int counter = 1;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        boolean reenter = false ;

        while (counter <= 10) {
            
            if (reenter == false) {
                System.out.print("Enter number #" + counter + " : ");
            } else {
                System.out.print("Re-Enter number #" + counter + " : ");
            }

           
            Boolean hasNextInt = scan.hasNextInt();
            
            if (hasNextInt) {

                int num = scan.nextInt();
                sum += num;
                scan.nextLine();
                counter ++;
                reenter = false;

            } else {
                reenter = true;
                scan.nextLine();
                System.out.println("********************************");
                System.out.println("** You Enterd Invalide number **");
                System.out.println("********************************");


            }

        }

        System.out.println("");
        System.out.println( "The sum of the valide numbers entered are : " + sum);
        System.out.println("");
        scan.close();

    }

}
