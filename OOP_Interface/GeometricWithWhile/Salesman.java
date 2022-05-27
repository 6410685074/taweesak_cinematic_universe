public class Salesman extends PermanentEmployee {
    private static double PercentCommission;
    private double salary;
    private double Revenue;
    public static void setPercentCommission(double amount){
        PercentCommission=amount;
    }
    public Salesman(String name,String ID,double salary){
        super(name,ID,salary);
        this.salary=salary;
    }
    public double calculateBonusInCurrentYear(Company a){
        return a.getRevenueInCurrentYear()*PercentCommission;
    }
    public void setRevenueInCurrentYear(double a){
        Revenue=a;
    }
    public double getSalaryInCurrentYear(){
        return super.getSalaryInCurrentYear()+Revenue*PercentCommission;
    }
    
}
