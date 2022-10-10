/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Designer;

/**
 *
 * @author augus
 */
public interface DictionaryItem {
    // print information of the dictionary item

    public String toString();

    // return the key of the dict ionary item
    public Object getKey();

    // compare the key of this object item with otherKey
    // returns value >, ==, < 0 if the key of this object
    // is >, equals, is < keyK
    public int compareTo(Object keyK);
}
