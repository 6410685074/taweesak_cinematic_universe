import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class prob7_4_2 {
    public static void main(String[] args)throws IOException {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader console=new BufferedReader(reader);
        System.out.println("input the radius of a sphere");
        String input=console.readLine();
        double radius=Double.parseDouble(input);
        Sphere r=new Sphere(radius);
        System.out.println(r.getRadius());
        System.out.println(r.getSurfaceArea());
        System.out.println(r.getVolume());
        }
}
