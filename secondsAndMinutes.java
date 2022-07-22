public class secondsAndMinutes {
    
    private static String Invalide_Message = "Invalide Value";

    public static void main(String[] args) {
        System.out.println(getDurationString( -3909));
    }

    public static String getDurationString(long minutes, long seconds) {

        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {

            long hour = (int) minutes / 60;
            minutes = (int) minutes % 60; 

            String second = "" + seconds;
            String minute = "" + minutes;
            String hr = "" + hour;

            if(seconds < 10){
                second  = "0" + seconds;
                 
            };

            if(minutes < 10){
                 minute = "0" + minutes;
            };

            if(hour < 10){
                 hr = "0" + hour;
            };

            return ( hr + "h " + minute + "m " + second + "s");
        } else {
            return Invalide_Message;
        }
    }

    public static String getDurationString(long seconds) {
        if (seconds >= 0 ) {
            long minutes = (int) seconds / 60;
            seconds = (int) seconds % 60 ;
            String time = getDurationString(minutes, seconds);
            return time;
        } else {
            return Invalide_Message;
        }
    }
}
