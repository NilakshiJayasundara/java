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
public class Summing {
    public void sumarray()
    {
        int buckey[]= {2,4,6,8,9};
        int sum=0;
        
        for(int counter=0;counter<buckey.length;counter++){
        sum+=buckey[counter];
        
        }
        System.out.println(sum);
        
        
        
    }
}
