/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stacks;

/**
 *
 * @author augus
 */
public class Stack implements StackADT
{
  // instance variables
  private Object stackArray[];
  private int top;

  // constructors
  public Stack(int maxSize)
  {
    stackArray = new Object[maxSize];
    top = -1;
  }
  public Stack()
  {
    this(100); // maxSize is 100, by default
  }

  // methods
  public void push(Object o) throws StackFullException
  {
    if (size() == stackArray.length)
     throw new StackFullException("Stack is full.");
    stackArray[++top] = o;
  }
  public Object pop() throws StackEmptyException
  {
    if (isEmpty())
     throw new StackEmptyException("Stack is empty.");
    return stackArray[top--];
  }
  public int size()
  {
    return top+1;
  }
  public boolean isEmpty()
  {
    return (size() == 0);
  }
  public Object top()
    throws StackEmptyException
  {
    if (isEmpty())
     throw new StackEmptyException("Stack is empty.");
    return stackArray[top];
  }
}
