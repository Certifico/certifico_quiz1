/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificoquiz1;

/**
 *
 * @author khian
 */
import java.util.Scanner;
import java.util.Arrays;

public class Certificoquiz1 {
        
    public static Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        displayniSiya();
        TheMenu();
}
    public static void displayniSiya(){
        System.out.println("***************************************");
        System.out.println("* KHIANNE QUIZ 1, Part 2: Code Timerr !!*");
        System.out.println("***************************************");
    }
    public static void TheMenu(){
        System.out.println("PRESS [1] Question 1 Answer");
        System.out.println("PRESS [2] Question 2 Answer");
        System.out.println("PRESS [3] Question 3 Answer");
        System.out.println("PRESS [4] EXIT");
        int choice = userChoice(1, 4);
        
        switch (choice) {
            case 1:
                number1();
                break;
            case 2:
                number2();
                break;
            case 3:
                number3();
                break;
            case 4:
                scn.close();
                System.out.println("THANK YOU SIR");
                break;
            default:
                System.out.println("TRY AGAIN.");
                break;
        }
    }
    
    public static void number1(){
      int [] arr = {82,44,96,7,13,56,74,14,98,36};
        System.out.println(Arrays.toString(arr));
    }
    
    public static void number2(){
        System.out.println("Set # of Array: ");
        int n = scn.nextInt();
        
    }
    
    public static void number3(){
    
            int[] arrey = {82,44,96,7,13,56,74,14,98,36};
    
        System.out.println("Original Set of Array: ");
        printArray(arrey);
        
        bubbleSort(arrey);
        
        System.out.println("New Set of Array: ");
        printArray(arrey);
        
    }
    public static void bubbleSort(int arrey[]){
        int n = arrey.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arrey [j] > arrey [j + 1]) {
                    int m = arrey[j];
                    arrey[j]= arrey[j + 1];
                    arrey[j + 1] = m;
                    
                }
            }
        }
        
    }
    public static void printArray(int arrey[]){
        for (int num : arrey) {
            System.out.println(num + " ");
        }
    } 

    private static int userChoice(int min, int max) {
        int choice;
        while (true) {            
            System.out.println("Enter your Choice: ");
            choice = scn.nextInt();
            if (choice >= min && choice <= max) {
                break;
            }
            System.out.println("TRY AGAIN.");
        }
        return choice;
    }
    }