/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input day, month and year: ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        boolean check =CheckDate.CheckDate(month, year, day);
        System.out.println(check);
    }
    
}
