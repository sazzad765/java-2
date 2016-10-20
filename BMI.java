/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight_pounds = input.nextDouble();
        
        System.out.println("Enter height in inches: ");
        double height_inches=input.nextDouble();
        
        double w_kg=weight_pounds*0.45359237;
        double h_meters= height_inches*0.0254;
        
        double BMI = (w_kg /h_meters)/h_meters;
        System.out.println("BMI is"+BMI);
        
    }
    
}
