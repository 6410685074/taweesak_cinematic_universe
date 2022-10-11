/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complex;

/**
 *
 * @author augus
 */
public class Complex implements ComplexADT{
    private double a;
    private double b;
    
    public Complex(double realpart,double imgpart){
        a=realpart;
        b=imgpart;
    }
    public String toString(){
        return (b>0)?(a+"+j"+b):(a+"-j"+(-1*b));
    }
    public double getRealPart(){
        return b;
    }
    public double getImgPart(){
        return a;
    }
    public Complex conjugate(){
        return (new Complex(a,-b));
    
    }
    public Complex add(Complex z){
        return (new Complex(a+z.getRealPart(),b+z.getImgPart()));
    }
    public Complex subtract(Complex z){
        return (new Complex(a-z.getRealPart(),b-z.getImgPart()));
    }
    public Complex multiply(Complex z){
        double c=z.getRealPart();
        double d=z.getImgPart();
        return (new Complex(a*c-b*d,b*c+a*d));
    }
    public Complex divide(Complex z)throws ZeroDivisorException{
        double c=z.getRealPart();
        double d=z.getImgPart();
        if(c==0&&d==0){
            throw new ZeroDivisorException("Divisor is zero");
        }
        return (new Complex(((a*c+b*d)/(c*c+d*d)),((b*c-a*d)/(c*c+d*d))));
    }
    
    
    
    
}
