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
public class Tablearray {
    public void table() {
        System.out.println("Index\tValue");
        int buckey[]= {2,3,4,5,6};
        
        for(int counter=0; counter<=buckey.length;counter++){
        System.out.println(counter+ "\t" + buckey[counter]);}
    }
}
