/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pounds_into_kilograms;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Pounds_into_kilograms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
         double pound = input.nextDouble();
         
         double kg = pound*0.454;
         System.out.println(pound+" pounds is  "+kg+" kilograms");
    }
    
}
