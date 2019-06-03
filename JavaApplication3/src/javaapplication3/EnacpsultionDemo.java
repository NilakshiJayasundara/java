/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author nilakshi
 */
public class EnacpsultionDemo {
    private int empAge;
    public int getEmpAge(){
    return empAge;
    }
    
    public void setEmpAge(int newValue){
    empAge=newValue;
    }
    public void take(){
    System.out.printf("The employee age %d", getEmpAge());
    }
    
}
