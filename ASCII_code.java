/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii._code;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class ASCII_code {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("Enter an ASCII code: ");
        char ch=input.next().charAt(0);
        
        int value =ch;
        System.out.println("The character for ASCII code  "+value);
        
    }
    
}
