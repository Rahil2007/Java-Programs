public class Days{
    public static void ConvertSeconds(int td){
        int convYears = td/365;
        int convMonths = ((convYears * 365) - td)/30;
        int totalMY = (convMonths * 30) + (convYears * 365);
        int convDays = (td - totalMY);
        System.out.println(convYears + " Years");
        System.out.println(convMonths + " Months");
        System.out.println(convDays+ " Days");
    }
}
