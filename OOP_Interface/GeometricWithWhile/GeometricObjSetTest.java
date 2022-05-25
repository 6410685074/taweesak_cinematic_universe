import java.util.Scanner;
public class GeometricObjSetTest {
    public static void main(String[] args) {
        GeometricObjSet ObTest=new GeometricObjSet();
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Hello welcome to Geo_metric program");
        System.out.println("Enter 0 to check status");
        System.out.println("Enter 1 to add Rectangle");
        System.out.println("Enter 2 to add Circle");
        System.out.println("Enter 3 to add Triangle");
        System.out.println("enter 4 to end");
        String a=sc.nextLine();
        if(a.equals("0")){
            System.out.println(ObTest);
        }
        else{
        if(a.equals("1")){
            System.out.println("enter side of Rectangle");
            double sidea=sc.nextDouble();
            double sideb=sc.nextDouble();
            ObTest.add(new Rectangle (sidea,sideb));
        }
        if(a.equals("2")){
            System.out.println("enter radius of Circle");
            double radius1=sc.nextDouble();
            ObTest.add(new Circle (radius1));
        }
        if(a.equals("3")){
            System.out.println("enter side of triangle");
            double sidea=sc.nextDouble();
            double sideb=sc.nextDouble();
            double sidec=sc.nextDouble();
            ObTest.add(new Triangle (sidea,sideb,sidec));
        }
            
        }
        if(a.equals("4")){
            System.out.println("thank you");
            break;
        }
        
    }
        }
    }
