/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.atully.lotterywhileloops;

import java.util.Arrays;

/**
 *
 * @author Andrew Tully andrew.tully@nln.ie 
 */
public class LotteryWhileLoops {

    public static void main(String[] args) {
        int x, y;
        boolean numberExists;
        int[] lotteryNumbers = new int[6];
        
        x = 0;
        while (x < 6) {
            int nextNumber = (int)(Math.random()*10+1);
            numberExists = false;
            
            y = 0;
            while (y < 6){
             //System.out.println("test");                  
                if (nextNumber == lotteryNumbers[y]) {
                    numberExists = true;
                    
                }
                y++;
                
            }
            if (numberExists == false) {
            lotteryNumbers [x] = nextNumber;
            x++;
            }
            System.out.println("Val of random: " + nextNumber);
               
        }
        
        System.out.println(Arrays.toString(lotteryNumbers));
    }
}

