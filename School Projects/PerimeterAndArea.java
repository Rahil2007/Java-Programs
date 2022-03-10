public class PerimeterAndArea
{
    public static void FloatSquare(float s)
    {
        float perimeter = 4 * s;
        float area = s * s;
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
    }
    
    public static void FloatRectangle(float l, float b)
    {
        float perimeter = 2 * (l + b);
        float area = l * b;
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
    }

    
    public static void Square(int s)
    {
        int perimeter = 4 * s;
        int area = s * s;
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
    }
    
    public static void Rectangle(int l, int b)
    {
        int perimeter = 2 * (l + b);
        int area = l * b;
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
    }

}