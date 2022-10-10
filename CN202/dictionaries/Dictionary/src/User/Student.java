/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Designer.DictionaryItem;

/**
 *
 * @author augus
 */
public class Student implements DictionaryItem {

    private String studentID;// key of student object
    private String name;

    public Student(String anID, String aName) {
        studentID = anID;
        name = aName;
    }

    public String toString() {
        return "ID: " + studentID + ", Name: " + name;
    }

    public Object getKey() {
        return studentID;
    }

    public int compareTo(Object keyStudentID) {
        /* compare studentID of this student object with keyStudentID
        return value <, ==, > 0 if studentID of this student
        is <, equals, > keyStudentID */
        return (studentID.compareTo((String) keyStudentID));
    }
}
