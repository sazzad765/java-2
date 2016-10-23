/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrolls;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Payrolls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

	  

   Scanner input = new Scanner(System.in);

   System.out.print("Enter employee name: ");
   String employeeName = input.next();
   
   System.out.print("Enter number of hours worked in a week: ");
   int hoursWorked = input.nextInt();

   System.out.print("Enter hourly pay rate: ");
   double payRate = input.nextDouble();

   System.out.print("Enter federal tax withholding rate: ");
   double fedTax = input.nextDouble();

   System.out.print("Enter state tax withholding rate: ");
   double stateTax = input.nextDouble();
   

   System.out.print("Employee Name: employeeName");
   
	   
   
   System.out.println("Hours Worked:" + hoursWorked);
   
   System.out.println("Pay Rate:" + payRate);
  


   double grossPay;
   grossPay = payRate * hoursWorked;
   
   System.out.println("Gross Pay:" + grossPay);
   
   double deductions;
   deductions = grossPay * fedTax;

   System.out.println("Deductions:");
   System.out.println("\tFederal Witholding %: $" +  deductions);
   
   double statTax;
   statTax = grossPay * stateTax;
   
   System.out.println("\tState Witholding %: $" +  statTax);
  
   double totalDeduction;
   totalDeduction = deductions + statTax;

   System.out.println("\tTotal Deduction: $" + totalDeduction);
   
   
   double netPay;
   netPay = grossPay - totalDeduction;

   System.out.println("Net Pay:" + netPay);
   }
} 

  