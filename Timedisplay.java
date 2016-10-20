/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timedisplay;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Timedisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter integer number for seconds: ");
        
        int seconds = input.nextInt();
        
        int minutes = seconds/60;
        int remainingSeconds= seconds%60;
        
        System.out.println(seconds+"seconds is"  +   minutes  +  "minutes" +  remainingSeconds +"secounds");
        
    }
    
}
