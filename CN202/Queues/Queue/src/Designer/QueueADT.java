/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Designer;

/**
 *
 * @author augus
 */
public interface QueueADT
{
  public void insert(Object o);
  public Object remove() throws QueueEmptyException;
  public int size();
  public boolean isEmpty();
  public Object front() throws QueueEmptyException;
}
