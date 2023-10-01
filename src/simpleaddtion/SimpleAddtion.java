/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simpleaddtion;

import java.util.Scanner;

/**
 *
 * @author guiam
 */
public class SimpleAddtion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
  
        Scanner scanner = new Scanner(System.in);
        // Get user input for the first number
        System.out.print("Enter the first number: ");
        // validate that the input is a valid integer
        while (!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter a valid number");
            scanner.next(); // consume the valid input
        }
        // Assign the valid input to num1 
        int num1 = scanner.nextInt();
        // Get user input for the second number
        System.out.print("Enter the second number: ");
       // validate that the input is a valid integer
        while (!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter a valid number");
            scanner.next(); //consume the valid input
        }
        //Assign the valid input to num2
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}

        
   
    

