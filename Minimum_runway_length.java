/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimum_runway_length;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Minimum_runway_length {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter v and a: ");
        double v = input.nextDouble();
        double a = input.nextDouble();
        
        double length = Math.pow(v,2)/(2*a);
        
        System.out.printf("The minimum runway length for this airplane is %.3f", +length);
    }
    
}
