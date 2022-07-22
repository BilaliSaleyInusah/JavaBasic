public class method_overload {
    
    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(-10);
        
    }
    
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {

            // double feetToInches = feet * 12;
            // System.out.println(feet + " feet = " + feetToInches + " inches");

            // double feetToCentimeters = (feet * 12) * 2.54;
            // System.out.println(feet + " feet = " + feetToCentimeters + " cm");

            // double inchesToCentimeters = inches * 2.54;
            // System.out.println(inches + " inches = " + inchesToCentimeters + " cm");
            double feetToCentimeters = (feet * 12) * 2.54;
            double inchesToCentimeters = inches * 2.54;
            double total = feetToCentimeters + inchesToCentimeters;
            System.out.println(feet + " feet, " + inches + " inches = " + total);


            return total ;
        } else {
            return -1;
        }
    };

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches >= 0) {
            // double inchesTofeet = inches / 12;
            // System.out.println(inches + " inches = " + inchesTofeet + " feet");
            // double centimeters = calcFeetAndInchesToCentimeters(inchesTofeet, 0);
            // System.out.println( centimeters);
            int feet = (int) inches / 12;
            int remainder = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainder + " inches remaining");
            calcFeetAndInchesToCentimeters(feet, remainder);
            return 1;
            
        } else {
            return -1;
        }
        
    }

}
