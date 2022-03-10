public class DivisionCal{
    
    public static void divisionCal(double a, double b){
        double answer = a/b;
        double remainder = a % b;
        double roundedNumber = Math.round(answer);
        System.out.println("The quotient is " + answer + " and the remainder is " + remainder);
        System.out.println("The rounded value is " + roundedNumber);
    }
}