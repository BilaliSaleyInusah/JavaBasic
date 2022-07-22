public class sum3n5Challenge {

    public static void main(String[] args) {

        // System.out.println(isEvenNum(13));

        // int result = 0;
        // int breakPoint = 0;
        // int count = 1;

        // for (int i = 1; i <= 1000; i++) {

        // if ( i % 3 == 0 && i % 5 == 0) {
        //     System.out.println( "Found number : " + i);
        //     result = result + i;
        //     breakPoint ++;
        // }

        //     if (breakPoint >= 5) {
        //         System.out.println(result);
        //         break;
        //     }
            
        // }

        // while ( count < 1000 ) {
        //     if ( count % 3 == 0 && count % 5 == 0) {
        //         System.out.println( "Found number : " + count);
        //         result = result + count;
        //         breakPoint ++;
        //     }
           
        //     if (breakPoint == 5) {
        //         System.out.println(result);
        //         break;
        //     }
        //     count++;
        // }

        // do {
        //     if ( count % 3 == 0 && count % 5 == 0) {
        //         System.out.println( "Found number : " + count);
        //         result = result + count;
        //         breakPoint ++;
        //     } 
        //     if (breakPoint == 5) {
        //         System.out.println(result);
        //         break;
        //     }  
        //     count ++;
        // } while (count <= 10000);


        int start = 4;
        int finish = 20;
        int result = 0;
        while (start < finish) {

            if (result == 5) {
                System.out.println("The total number of even number found is : " + result);
                break;
            }
            
            if (!isEvenNum(start)) {
                start ++;
                continue;
            }
            System.out.println("Found number : " + start);
            result ++;
            start ++;

            
        }


    }

    public static boolean isEvenNum(int num) {
        if (num % 2==0) {
            return true;
        } else {
            return false;
        }
    }

}
