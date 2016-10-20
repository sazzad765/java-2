/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package future_investment;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Future_investment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
       
        System.out.println("Enter investment amount: ");
        double investment=input.nextDouble();
        
         
        System.out.println("Enter monthly interest rate: ");
        double interest_rate=input.nextDouble();
        
        System.out.println("Enter number of years: ");
        double years=input.nextDouble();
        
        double monthly_interest_rate = (interest_rate/100)/12;
        
       
        double future_investment = investment*Math.pow((1+monthly_interest_rate),(years*12));
        
        System.out.printf("Accumulated value is %.2f",future_investment);
    }
    
}
