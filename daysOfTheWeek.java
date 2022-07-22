public class daysOfTheWeek {
    public static void main(String[] args) {
        System.out.println(printDayOfTheDay(7));
        System.out.println(printDayOfTheDay2(4));
    }

    public static String printDayOfTheDay(int num) {
        String result = "";

        switch (num) {
            case 0:
                result = "Sunday";
                break;
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";        
                break;
            case 4:
                result = "Thursday";            
                break;
            case 5:
                result = "Friday";                
                break;
            case 6:
                result = "Saturday";                     
                break;
            default:
                result = "Invalide Day";
                break;
        }
        return result;
    }

    public static String printDayOfTheDay2(int num){
        String result = "";
        if (num == 0) {
            result = "Sunday";
        } else if (num == 1) {
            result = "Monday";
        } else if (num == 2) {
            result = "Tuesday";
        } else if (num == 3) {
            result = "Wednesday";
        } else if (num == 4) {
            result = "Thursday";
        } else if (num == 5) {
            result = "Friday";
        } else if (num == 6) {
            result = "Saturday";
        }else {
            result = "Invalide Day";
        }
        return result;
    }
}
