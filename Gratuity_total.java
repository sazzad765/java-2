/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gratuity_total;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Gratuity_total {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal=input.nextDouble();
        int gratuity_rate = input.nextInt();
        
        double gratuity =(subtotal/100) * gratuity_rate;
        double total = gratuity + subtotal;
        
        System.out.println("The gratuity is  "+gratuity+"  and total is "+total);
                
    }
    
}
