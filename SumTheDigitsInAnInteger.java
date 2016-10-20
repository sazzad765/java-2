/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumthedigitsinaninteger;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class SumTheDigitsInAnInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number 0 to 1000: ");
        int num = input.nextInt();
        
        int ones = num%10;
        int tens = (num /10 )%10;
        int houndreds =(num/100)%10;
        
        int result = ones+tens+houndreds ;
        
        System.out.println("The sum of the digit is  "+result);
    }
    
}
