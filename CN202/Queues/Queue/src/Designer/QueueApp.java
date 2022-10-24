/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Designer;

/**
 *
 * @author augus
 */
public class QueueApp
{
  public static void main(String[] args)
  {
    Queue theQueue = new Queue();
    theQueue.insert(new Integer(10));
    theQueue.insert(new Integer(20));
    theQueue.insert(new Integer(30));
    theQueue.insert(new Integer(40));

    theQueue.remove();
    theQueue.remove();
    theQueue.remove();

    theQueue.insert(new Integer(50));
    theQueue.insert(new Integer(60));
    theQueue.insert(new Integer(70));
    theQueue.insert(new Integer(80));

    while (!theQueue.isEmpty())
    {
      int n = ((Integer)theQueue.remove()).intValue();
      System.out.print(n + " ");
    }
    System.out.println();    
  }
}
