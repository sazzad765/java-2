/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package min_to_years;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Min_to_years {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int min= input.nextInt();
        
        int years= (((min/60)/24)/365);
         int day = min % 525600;
        int days = (day/1440);
       
        
        System.out.println(min+ " minutes is approximately " +years+" years "+days+" days");
    }
    
}
