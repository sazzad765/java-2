/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculating_energy;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Calculating_energy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Enter kilograms: ");
        double kilograms= input.nextDouble();
        
        System.out.println("Enter initial temperature: ");
        double initial_temperature= input.nextDouble();
        
        System.out.println("Enter final temperature: ");
        double final_temperature= input.nextDouble();
        
        double energy=kilograms*(final_temperature-initial_temperature)*4184;
        System.out.println("The energy needed is "+energy );
        
    }
    
}
