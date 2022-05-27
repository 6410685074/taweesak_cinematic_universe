public abstract class Employee {
    private String name;
    private String employeeID;
    public Employee(String name,String ID){
        this.name=name;
        employeeID=ID;
    }
    public void setRevenueInCurrentYear(double Revenue,Company a){
        a.addRevenueInCurrentYear(Revenue);
    }
    public abstract double getSalaryInCurrentYear();
    public String toString(){
        System.out.println(name+":"+employeeID);
        return"";
    }
}
