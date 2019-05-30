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
        
public class cal {
    public void calc(){
         Scanner buckey = new Scanner(System.in);
         int fnum ,snum;
         int answer=0;
         System.out.println("Enter the first number: ");
         fnum= buckey.nextInt();
         System.out.println("Enter the second number: ");
         snum=buckey.nextInt();
         int a;
         System.out.println("enter 1 for add,enter 2 for subtract,enter3 for divide");
         a=buckey.nextInt();
         switch(a){
             case 1:
                answer=fnum+snum;
                break;
             case 2:
                answer=fnum-snum;
                break;
            }
          System.out.println(answer);      
        
       
        
             
         
     
}
}
