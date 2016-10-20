/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        
        System.out.println("Input three number: ");
        
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        
        double average = (number1+number2+number3)/3;
        
        System.out.println(" Average is" +average);
    }
    
}
