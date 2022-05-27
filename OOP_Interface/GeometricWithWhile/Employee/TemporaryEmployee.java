public class TemporaryEmployee extends Employee{
    private static double DailySalary;
    private final double DAYS=365;
    public TemporaryEmployee(String name,String ID){
        super(name,ID);
    }
    public static void setDailySalary(double amount){
        DailySalary=amount;
    }
    public double getSalaryInCurrentYear(){
        return DailySalary*DAYS;
    }
}
