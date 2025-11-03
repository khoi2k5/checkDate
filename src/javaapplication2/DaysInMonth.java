/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author DELL
 */
public class DaysInMonth {

    public static int DaysInMonth( int month, int year) {
        if (month >= 1 && month <= 12) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                return 31;
            } else {
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                   return 30;
                } else if (month == 2) {
                    if (year % 400 == 0) {
                        return 29;

                    } else if (year % 100 == 0) {
                       return 29;
                    } else if (year % 4 == 0) {
                        return 29;
                        
                    }else{
                        return 28;
                    }
                }
            }
        } 
        return 0;

    }
}
