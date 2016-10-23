/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsius_to_fahrenheit;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Celsius_to_Fahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for Celsius: ");
        double Celsius=input.nextDouble();
        
        double fahrenheit = (9.0 /5)* Celsius + 32;
        
        System.out.println( Celsius+" Celsius "+fahrenheit+" fahrenheit");
    }
    
}
