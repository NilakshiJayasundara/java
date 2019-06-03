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
public class paramethd {
    public void simpleMessage(String name){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name");
        name = input.nextLine();
        System.out.println("Hello"+name);}
}
