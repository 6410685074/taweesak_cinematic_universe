public class Rectangle implements GeometricObj{
    private double width;
    private double height;
    public Rectangle(double widthVal,double heightVal){
        width=widthVal;
        height=heightVal;
    }
    public Rectangle(double sideVal){
        this(sideVal,sideVal);
    }
    public Rectangle(){
        this(1.0);
    }
    public double getArea(){
        return width*height;
    }
    public double getCircumstance(){
        return 2*(width+height);
    }
    public String toString(){
        
        System.out.printf("Rectangle :\twidth = %f ,height = %f",width,height);
            
        
        return "";
}
}
