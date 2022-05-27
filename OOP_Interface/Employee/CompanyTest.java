public class CompanyTest {
    public static void main(String[] args) {
        Company abc=new Company("abc Company");
        TemporaryEmployee.setDailySalary(150.50);
        Salesman.setPercentCommission(0.15);
        Staff somchai=new Staff("Somchai", "01", 25000, 0.1);
        abc.addEmployee(somchai);
        Staff somsri=new Staff("Somsri","02", 8000, 0.02);
        abc.addEmployee(somsri);
        Salesman niwat=new Salesman("Niwat", "03", 15000);
        abc.addEmployee(niwat);
        Salesman ponsak=new Salesman("Ponsak", "04", 12000);
        abc.addEmployee(ponsak);
        TemporaryEmployee somsak=new TemporaryEmployee("Somsak", "05");
        abc.addEmployee(somsak);
        niwat.setRevenueInCurrentYear(200000,abc);
        ponsak.setRevenueInCurrentYear(100000, abc);
        System.out.println("total Revenue="+abc.getRevenueInCurrentYear());
        abc.calculateBonusInCurrentYear();
        System.out.println("total profit="+abc.getProfitInCurrentYear());
        System.out.println(abc.getTotalpayment());
        

        }
    
}
