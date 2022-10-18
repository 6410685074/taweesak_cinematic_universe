/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package stacks;

/**
 *
 * @author augus
 */
public interface StackADT
{
  public void push(Object o);
  public Object pop() throws StackEmptyException;
  public int size();
  public boolean isEmpty();
  public Object top() throws StackEmptyException;
}
