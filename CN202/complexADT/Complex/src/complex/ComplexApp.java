/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//user
package complex;

/**
 *
 * @author augus
 */
public class ComplexApp
{
  public static void main(String[] args)
  {
    Complex z1 = new Complex(3,4);
    Complex z2 = new Complex(5,12);
    Complex z3 = new Complex(2,1);
                
    System.out.println((z1.add(z2.conjugate())).divide(z3));
  }
}
