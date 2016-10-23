/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monetary_units;

import java.util.Scanner;

/**
 *
 * @author sazza
 */
public class Monetary_units {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        int amount = input.nextInt();
        
        int dollars= amount/100;
        
        int cents = amount %100;
        
        System.out.println("Your amount "+amount+" represents "+dollars+" dollars "+cents +" cents");
    }
    
}
