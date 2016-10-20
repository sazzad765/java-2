/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display_balance;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Display_balance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance: ");
        double balance= input.nextDouble();
        
        System.out.println("Enter Interest rate: ");
        double annual_interest_rate= input.nextDouble();
        

     
      
        
        double month_interest_rate=(annual_interest_rate/100)/12;
        
         
         double total =balance*(1+month_interest_rate);
                total= (balance+total)*(1+month_interest_rate); 
                total= (balance+total)*(1+month_interest_rate); 
                total= (balance+total)*(1+month_interest_rate); 
                total= (balance+total)*(1+month_interest_rate); 
                 
        System.out.println("The account value after the sixth month"+total);         
        
        


        }
        
        
                
    }
    

