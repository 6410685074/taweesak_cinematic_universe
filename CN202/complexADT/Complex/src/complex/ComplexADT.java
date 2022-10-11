/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package complex;

/**
 *
 * @author augus
 */
public interface ComplexADT{
    public String toString();
    public double getRealPart();
    public double getImgPart();
    public Complex conjugate();
    public Complex add(Complex a);
    public Complex subtract(Complex a);
    public Complex multiply(Complex a);
    public Complex divide(Complex a)throws ZeroDivisorException;

}
