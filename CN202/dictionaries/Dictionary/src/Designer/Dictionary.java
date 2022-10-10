/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Designer;

/**
 *
 * @author augus
 */
public class Dictionary implements DictionaryADT {
    // using an ordered array to store
    // items in the dictionary

    private DictionaryItem[] a;
    private int nItems;

    // implementation of methods & constructors
    public Dictionary(int max) {
        a = new DictionaryItem[max];
        nItems = 0;
    }

    public Dictionary() {
        this(100);
    }

    public DictionaryItem find(Object key) {
        int low = 0;
        int high = nItems - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid].compareTo(key) == 0) {
                return a[mid]; // found it
            } else if (a[mid].compareTo(key) > 0) { // System.out.println("lower half");
                high = mid - 1; // lower half
            } else { // System.out.println("upper half");
                low = mid + 1;  // upper half
            }
        }
        return null; // can't find it
    }

    public void insert(DictionaryItem item)
            throws DictionaryFullException {
        if (nItems == a.length) {
            throw new DictionaryFullException("Dictionary is full.");
        }

        int j;
        for (j = 0; j < nItems; j++) {
            if (a[j].compareTo(item.getKey()) > 0) {
                break;
            }
        }
        for (int k = nItems; k > j; k--) {
            a[k] = a[k - 1];
        }
        a[j] = item;
        nItems++;
    }

    public boolean delete(Object key) {
        int low = 0;
        int high = nItems - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid].compareTo(key) == 0) {
                // found it
                for (int k = mid; k < (nItems - 1); k++) {
                    a[k] = a[k + 1];
                }
                nItems--;
                return true;
            } else if (a[mid].compareTo(key) > 0) {
                high = mid - 1; // lower half
            } else {
                low = mid + 1; // upper half
            }
        }
        return false; // can't find it
    }

    public void display() {
        for (int j = 0; j < nItems; j++) {
            System.out.println(a[j]);
        }
    }
}
