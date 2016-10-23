/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmt_current_time;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class GMT_current_time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        
        System.out.println("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();
        long totalMilliSeconds = System.currentTimeMillis();
        
        long totalSeconds = totalMilliSeconds/1000;
        long currentSeconds = (int ) (totalSeconds%60);
        long totalminutes = totalSeconds/60;
        long currentMinutes=totalminutes%60;
        long totalhours= totalminutes % 60;
        long currenthours = totalhours/24;
        
        currenthours = currenthours+ offset;
        
        System.out.println("Current time is "+currenthours+":"+currentMinutes+":"+currentSeconds+" GMT");
        
    }
    
}
