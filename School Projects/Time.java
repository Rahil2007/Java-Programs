public class Time{
    public static void ConvertSeconds(int ts){
        int convHour = ts/3600;
        int convMin = ((convHour * 3600) - ts)/60;
        int convSec = (ts - ((convMin * 60) + (convHour * 3600)));
        System.out.println(convHour + " hours");
        System.out.println(convMin + " minutes");
        System.out.println(convSec + " seconds");
    }
}