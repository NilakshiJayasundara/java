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
public class paracons {
    String girlName;
    //This is parameterized constructors.
    public paracons(String name)
    {
    girlName=name;
    }
    
    public void saying()
    {
    System.out.println("This is my gf "+girlName );
    }
    
}
