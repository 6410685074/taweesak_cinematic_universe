public class Triangle implements GeometricObj{
    private double aside;
    private double bside;
    private double cside;
    public Triangle(double a,double b,double c){
        aside=a;
        bside=b;
        cside=c;
    }
    public Triangle(double side){
        aside=bside=cside=side;
    }
    public Triangle(){
        this(1.0,1.0,1.0);
    }
    public double getArea(){
        double s=(aside+bside+cside)/2;
        return Math.sqrt(s*(s-aside)*(s-bside)*(s-cside));
    }
    public double getCircumstance(){
        return aside+bside+cside;
    }
    public String toString(){
        
    System.out.printf("Triangle:\tsideA = %f ,sideB = %f,sideC=",aside,bside,cside);        
        return "";
}
}
