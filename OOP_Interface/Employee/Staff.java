public class Staff extends PermanentEmployee{
    //get bonus
    private double salary;
    private double bonus;
    private double bonusInCurrentYear;
    public Staff(String name,String ID,double salary,double bonus){
        super(name,ID,salary);
        this.salary=salary;
        this.bonus=bonus;
    }
    public double calculateBonusInCurrentYear(Company a){
        bonusInCurrentYear=a.getProfitInCurrentYear()*bonus;
        return bonusInCurrentYear;
    }
    public double getSalaryInCurrentYear(){ 
        return super.getSalaryInCurrentYear()+bonusInCurrentYear;
    
}
}
