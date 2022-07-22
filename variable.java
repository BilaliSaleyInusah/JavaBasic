public class  variable {
    
    public static void main(String[] args) {

        // integers 

        byte myByte = 60;
        short myShort = 200;
        int myInt = 1000000;
        long myLong = (long) ((50000l + 10l) * (myByte + myShort + myInt));
        // System.out.println(myLong);

        long myLong2 = (50000 + 10) * (long) (myByte + myShort + myInt) ;
        // System.out.println(myLong2);

        // float and double
        float myFloat = (float) 5.4;
        float myFloat2 = 5.4f;
        float myFloat3 = 5f / 3;
        double myDouble = 5.4;
        double myDouble2 = 5.4d;
        double myDouble3 = 5d / 3;
        System.out.println(myFloat3);
        System.out.println(myDouble3);
        System.out.println("");

        // Converting a given number of pounds to kilograms 
        double pounds = 200d;
        double kilograms = pounds * 0.45359237;
        System.out.println(kilograms); 
        System.out.println("");

        // Char and Boolean 
        char myChar = '\u0041';
        System.out.println(myChar);
        char myChar2 = '\u00AE';
        System.out.println(myChar2);
        System.out.println("");

        // String
        String myString = "hello world!";
        System.out.println(myString);
        myString = myString + " Zoo";
        System.out.println(myString);
        System.out.println("");

        // operators 
        // =
        // -
        // /
        // %
        // *
        // ++
        // --
        int result = 3;
        result++;
        System.out.println(result);

        // &&
        if (result >= 1 && result < 5) {
            System.out.println("correct");
        }


        // ||
        if (result >= 1 || result < 2) {
            System.out.println("correct");
        };
        System.out.println("");

        // ? : 
        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);
        int car = isCar ? 10 : 0;
        System.out.println(car);
        System.out.println("");

        // challeng
        double num1 = 20;
        double num2 = 80;
        double sumNum1Num2 = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sumNum1Num2);
        double product = sumNum1Num2 * 25;
        System.out.println(sumNum1Num2 + " * " + "25 = " + product);
        double remaindar = sumNum1Num2 % 40;
        System.out.println(sumNum1Num2 + " % 40 = " + remaindar);
        if (remaindar <= 20) {
            System.out.println("Total was over limite");
        }
        double remaindar2 = product % 40;
        if (remaindar2 <= 20) {
            System.out.println("Total was over limite");
        }
    }
}
