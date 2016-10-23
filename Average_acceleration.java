/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average_acceleration;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Average_acceleration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter v0 , v1 & t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        
        double a= (v1-v0)/t;
        
        System.out.printf("The average acceleration is %.4f ", +a );
    }
    
}
