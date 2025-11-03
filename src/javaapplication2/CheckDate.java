/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author DELL
 */
public class CheckDate {
    public static boolean CheckDate(int month, int year, int day){
        
        if(month>=1&&month<=12){
            if(day>=1){
                if(day<=DaysInMonth.DaysInMonth(month, year)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
}
