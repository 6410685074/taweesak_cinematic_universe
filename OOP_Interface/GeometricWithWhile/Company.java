import java.util.ArrayList;
public class Company {
    private String name;
    private static final double PERCENT_PROFIT=0.4;
    private ArrayList<Employee> employee;
    private double Revenue;
    private double profit;
    private double Totalpayment;
    public Company(String comname){
        name=comname;
        employee=new ArrayList<Employee>();
    }
    public void addEmployee(Employee a){
        employee.add(a);
    }
    public void addRevenueInCurrentYear(double amount){
        Revenue=Revenue+amount;
    }
    public double getRevenueInCurrentYear(){
        return Revenue;
    }
    public void calculateBonusInCurrentYear(){
        profit=Revenue*PERCENT_PROFIT;
    }
    public double getProfitInCurrentYear(){
        return profit;
    }
    public double getTotalpayment(){
        for(Employee d:employee){
            double OnepersonIncome=d.getSalaryInCurrentYear();
            System.out.println(d+"Income each person="+OnepersonIncome);
            Totalpayment=Totalpayment+OnepersonIncome;
        }
        return Totalpayment;
    }

}
