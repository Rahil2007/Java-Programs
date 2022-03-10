public class Compare{
    
    public static void main(float a, float b, float c){
        //If number 1 is greater than both the numbers.
        if(a > b && a > c)
        {
            System.out.println(a + " is greater than " + b + " and " + c);
            System.out.println("a is greater than b and c");
        }
        //If number 1 is lesser than both the numbers.
        else if (a < b && a < c)
        {
            System.out.println(a + " is lesser than " + b + " and " + c);
            System.out.println("a is lesser than b and c");
        }
        //If all the numbers are equal.
        else if(a == b && a == c)
        {
            System.out.println(a + " is equal to " + b + " and " + c);
            System.out.println("a is equal to both b and c");
        }
    }
    
}
