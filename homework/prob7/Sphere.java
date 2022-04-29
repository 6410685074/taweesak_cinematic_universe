
public class Sphere {
    private double radius;
    public Sphere(double radiu1){
        this.radius=radiu1;
    }
    public  double getRadius(){
        return this.radius;
    }
    public double getSurfaceArea(){
        return Math.PI*4*Math.pow(radius, 2);
    }
    public double getVolume(){
        return Math.PI*Math.pow(radius,3);
    }
}
