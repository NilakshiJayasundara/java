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
public class quiz {
    public void check(){
    Scanner buckey= new Scanner(System.in);
    int num, answer;
    System.out.println("Enter number");
    num= buckey.nextInt();
    
    answer = num%2;
    
    switch(answer){
        case 1:
            System.out.println("Odd number");
            break;
        case 0:
            System.out.println("Even number");
            break;
    }
    
    }
}
