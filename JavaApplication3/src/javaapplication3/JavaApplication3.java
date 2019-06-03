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
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       NewClass newclassobject=new NewClass();
//       statement marksobjet= new statement();
//       marksobjet.marks();
       // cal calobject=new cal();
        //calobject.calc();
        
        //quiz quizobject=new quiz();
        //quizobject.check();
       // forstar forstarobject=new forstar();
       // forstarobject.star();
       //counter counterobject= new counter();
       //counterobject.counternum();
       //paramethd paraobject = new paramethd();
       //paraobject.simpleMessage(name);
       /*Scanner input= new Scanner(System.in);
       System.out.println("Enter your first gf name");
       String myname=input.nextLine();
       
       tuna obj1=new tuna();
       obj1.setName(myname);
       obj1.saying();*/
       Scanner input = new Scanner(System.in);
       System.out.println("Enter employee Age");
       int age=input.nextInt();
       
       EnacpsultionDemo obj2 = new EnacpsultionDemo();
       obj2.setEmpAge(age);
       obj2.take();
       
       
       
       
    }
    
}
