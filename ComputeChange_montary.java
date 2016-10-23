/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computechange_montary;

import java.util.Scanner;

/**
 *
 * @author sazza
 */
public class ComputeChange_montary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an amount in double: ");
        double amount =input.nextDouble();
        
        int amount1=(int) (amount*100);
        
        int dollars= amount1/100;
        int amount2=amount1%100;
        
        int Quarters =amount2/25;
        int amount3 = amount2%25;
        
        int dimes = amount3/10;
        int amount4 = amount3%10;
        
        int nickels = amount4/5;
        
        int pennies = amount4%5;
        
        
        System.out.println("your amount "+amount+ " consists of \n"
        
                       +"\t"+dollars +" Dollars \n"
                       +"\t"+Quarters+" Quarters \n"
                       +"\t"+dimes+" Dimes \n "
                       +"\t"+nickels+" Nickels \n"
                       +"\t"+pennies+ " Pennies ") ;
        
    }
    
}
