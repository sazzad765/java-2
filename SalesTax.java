/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salestax;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class SalesTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

 System.out.print("Enter purchase amount: ");
 double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
         System.out.println("Sales tax is " +tax);
    }
    
}
