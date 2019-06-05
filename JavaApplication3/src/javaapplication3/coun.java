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
import java.util.Random;
public class coun {
    public void countarry()
    {
       Random rand =new Random();
       int freq[]= new int[7];
       
       for (int roll=1;roll<1000;roll++){
        ++freq[1+rand.nextInt(6)];
       }
      
       
       System.out.println("face\tFrequent");
       for (int face=0;face<freq.length;face++){
        System.out.println(face +"\t"+ freq[face]);}
       
    }
}
