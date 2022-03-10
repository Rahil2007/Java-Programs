public class InterestCalculator{
    
    public static void SI(float p, float r, int t){
        float simpleInterest = Math.round((p * r * t) / 100.0);
        float amount = p + simpleInterest;
        System.out.println("The simple interest " + simpleInterest);
        System.out.println("The amount after " + t + " years is " +  amount);
    } 
    
    public static void CI(float p, float r, int t){
        float amount =  Math.round(p * Math.pow(1 + (r / 100), t));
        float compoundInterest = amount - p;
        System.out.println("The amount after " + t + " years is " + amount);
        System.out.println("The compound interest is " + compoundInterest);
    }  
    
}