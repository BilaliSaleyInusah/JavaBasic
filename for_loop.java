public class for_loop {
    
    public static void main(String[] args) {
        // displayMessage(10);
        // interest(10000, 9);
        // System.out.println ("");
        // interestRevese(10000, 1);
        // System.out.println(isPrimeNum(3));
        displayPrimeNum(10,20); 
    }

    public static int displayMessage(int num) {
        
        for (int i = 0; i < num; i++) {
            System.out.println("The number is : " + i);
        };

        return 1;
    }

    public static int interest(double amount, double interestRate) {

        for (int i = 2; i < interestRate; i++) {
            double interest = amount * ( (double) i / 100 );
            System.out.println(amount + " @ " + i + "% interest = " + String.format("%.2f", interest));
        };
        return 1;
    }

    public static int interestRevese(double amount, double interestRate) {

        for (int i = 8; i > interestRate; i--) {
            double interest = amount * ( (double) i / 100 );
            System.out.println(amount + " @ " + i + "% interest = " + String.format("%.2f", interest));
        };
        return 1;
    }

    public static boolean isPrimeNum(int num){
        
        // if (num == 1) {
        //     return false;
        // };
        // for (int i = 2; i <= num/2; i++) {
        //     if (num % i == 0) {
        //         return false;
        //     }
        // }
        // return true;

        if (num >= 2) {
            for (int i = 2; i <= num/2; i++) {
                 if (num % i == 0) {
                     return false;
                 }
            }
            return true;
        }
        return false;

    };



    public static void displayPrimeNum(int numStart , int numEnd) {
        int numPrime = 0;
        for (int i = numStart ; i < numEnd; i++) {
            boolean result = isPrimeNum(i);
            if (result == true) {
                numPrime ++;
                System.out.println(i);
            } 
            if (numPrime == 3) {
                break;
            }
        }
        System.out.println("Number of prime numbers in the range of " + numStart + " to " + numEnd + " is : " + numPrime);
    }

}
