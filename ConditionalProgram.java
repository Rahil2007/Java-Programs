public class Number
{
    public static void Large(int Num1, int Num2, int Num3)
    {
        if(Num1 >= Num2 && Num1 >= Num3)
        {
            System.out.println("The first number is the largest amongst them");
        }
            
        if(Num2 >= Num1 && Num2 >= Num3)
        {
            System.out.println("The second number is the largest amongst them");
        }
        
        if(Num3 >= Num1 && Num3 >= Num2)
        {
            System.out.println("The third number is the largest amongst them");
        }
    }
    
    public static void Small(int Num1, int Num2, int Num3)
    {
        if(Num1 <= Num2 && Num1 <= Num3){
            System.out.println("The first number is the smallest amongst them");
        }
            
        if(Num2 <= Num1 && Num2 <= Num3)
        {
            System.out.println("The second number is the smallest amongst them");
        }
        
        if(Num3 <= Num1 && Num3 <= Num2)
        {
            System.out.println("The third number is the smallest amongst them");
        }
    }
}
