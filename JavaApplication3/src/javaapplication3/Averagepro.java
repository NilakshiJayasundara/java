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
import java.util.Scanner;
public class Averagepro {
    public void sample(){
        Scanner input= new Scanner (System.in);
        int total=0;
        int grade;
        int counter=0;
        int average;
        
        while(counter<10){
        grade = input.nextInt();
        total= total+grade;
        counter++;
        }
        average=total/10;
        System.out.println(+average);
    }
}
