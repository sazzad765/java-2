/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheittocelsius;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class FahrenheitToCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for fahrenhit: ");
        double fahrenhit=input.nextDouble();
        
        double celsius = ((5/9)*(fahrenhit-32));
        
        System.out.println("fahrenhit"+fahrenhit+"  =celsius"+celsius+"");
    }
    
}
