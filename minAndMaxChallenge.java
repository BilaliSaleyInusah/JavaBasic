import java.util.Scanner;

public class minAndMaxChallenge {
    
    public static void main(String[] args) {
        
        int minNumKey = 0 ;
        int minNum = 0 ;
        int maxNum = 0;


        while (true) {  

            System.out.print("Enter Numbber : ");
            Scanner scan = new Scanner(System.in);
            boolean hasNextInt = scan.hasNextInt();

            if (hasNextInt) {
                int num = scan.nextInt();

                if (minNumKey == 0) {
                    minNum = num;
                    maxNum = num;
                    minNumKey = 1;
                } else {

                    if (num < minNum) {
                        minNum = num;
                    }

                    if (num > maxNum) {
                        maxNum = num;
                    }

                }
                
            } else {
                Scanner scan2 = new Scanner(System.in);
                System.out.print("Press '1' for yes or anyother key for no : ");
                boolean hasNextInt2 = scan2.hasNextInt();
                
                if (hasNextInt2) {
                    int exit = scan2.nextInt();
                    if (exit == 1) {
                        break;
                    }
                }
                
            };
            

        };
        System.out.println("The minimum number is : " + minNum);
        System.out.println("The maximum number is : " + maxNum);

    }

}
