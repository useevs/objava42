/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class13;

import java.util.Observable;

/**
 *
 * @author shahzad
 */
public class Teacher extends Observable {

    private String studentName = "Default";

    public void addAssignment(String studentName) {
        this.studentName = studentName;
        setChanged();
        notifyObservers();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}
