/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volume;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Volume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter the radius and length of a cylinder: ");
        double radius=input.nextDouble();
        double length = input.nextDouble();
        
        double area = radius * radius * 3.14;
        double volume =area * length;
        
        System.out.println("the area is "+area+"\n"+"the volume is : "+volume);
    }
    
}
