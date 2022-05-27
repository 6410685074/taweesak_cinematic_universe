public class PermanentEmployee extends Employee{
    private final double MONTH=12;
    private double monthlySalary;
    public PermanentEmployee(String name,String ID,double salary){
        super(name,ID);
        monthlySalary=salary;
    }
    public double getSalaryInCurrentYear(){
        return MONTH*monthlySalary;
    }
    
}
