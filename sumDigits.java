public class sumDigits {
    
    public static void main(String[] args) {
        // System.out.println(sumDigit(125));
        System.out.println(sumDigit(125223));
        System.out.println(sumDigit(2));
        System.out.println(sumDigit(-5));
        System.out.println(sumDigit(0));
        System.out.println(sumDigit(1));
    }

    public static int sumDigit(int num) {
        int result = 0;
        if (num >= 10) {
            int second = 0;
            while ( num >=1 ) {
                int remainder = num % 10;
                second = second + remainder;
                num = num / 10;
            }
            result = num + second;

            return result;
        }
        return -1;
    }

}
