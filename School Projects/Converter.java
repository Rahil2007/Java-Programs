public class Converter{
    public static void kgToG(int kg){
        int g = kg * 1000;
        System.out.println(kg+ "kgs in grams is " + g + "g");
    }
    
    public static void gToKg(int g){
        int kg = g / 1000;
        System.out.println(g + "gs in Kilograms is " + kg + "kg");
    }
    
    public static void mToCm(int m){
        int cm = m/100;
        System.out.println(m + "ms in Centimeters is " + cm + "cm");
    }
}