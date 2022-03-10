public class Discount{
    public static void main(int laptop, int mobile)
    {
        int dislap = ((5/100) * laptop);
        int dismob = ((6/100) * mobile);
        int total = dislap + dismob;
        System.out.println("The total price for the laptop and mobile is $" + total);
    }
}