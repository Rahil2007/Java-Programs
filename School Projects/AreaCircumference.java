public class AreaCircumference{
    public static void main(float radius){
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.println("The area of the circle is " + area + " cm2");
        System.out.println("The circumference of the circle is " + circumference + " cm");
    }
}