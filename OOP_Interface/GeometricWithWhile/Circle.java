public class Circle implements GeometricObj{
    private double radius;
    public Circle(double radiusVal){
        radius=radiusVal;
    }
    public Circle(){
        this(1.0);
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumstance(){
        return Math.PI*2*radius;
    }
    public String toString(){
        
        System.out.printf("Circle :\traius = %f",radius);
            
        
        return "";
}
    
}
