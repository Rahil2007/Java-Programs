public class Salary{
    
    public static void NetSalary(){
        int basic = 25000;
        int da = ((5/100) * basic);
        int hra = ((2/100) * basic);
        int pf = 2500;
        int gs = (basic + da + hra);
        int ns = gs - pf;
        System.out.println("Net Salary = " + ns);
    }
    
    public static void NetSalaryCalculator(int basic, int dapercent, int hrapercent, int pf){
        int da = ((dapercent/100) * basic);
        int hra = ((hrapercent/100) * basic);
        int gs = (basic + da + hra);
        int ns = gs - pf;
        System.out.println("Net Salary = " + ns);
    }
}