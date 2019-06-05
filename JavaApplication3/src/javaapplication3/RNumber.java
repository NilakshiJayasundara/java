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
public class RNumber {
    public void Rnum(){
    Random dice= new Random();
    int number;
    
    for(int counter=0;counter<=10;counter++)
    {
           number= 1+dice.nextInt(7);
           System.out.println(number+" ");
    }
    }
}
