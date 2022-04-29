
public class prob7_4 {
    public static void main(String [] args) {
        double raidus=Double.parseDouble(args[0]);
        Sphere r=new Sphere(raidus);
        System.out.println(r.getRadius());
        System.out.printf("\t%.02f\t",r.getSurfaceArea());
        System.out.printf("%.02f",r.getVolume());
    }    
}
