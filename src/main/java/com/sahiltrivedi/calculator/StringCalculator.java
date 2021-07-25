/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sahiltrivedi.calculator;

/**
 *
 * @author Trivedi
 */
public class StringCalculator {     
    
    public int Add(String numbers)
    {
        int sum = 0;
        if(numbers == "" || numbers == null)
            return 0;
        else
        {
            String[] numberArray = numbers.split("[, \n]");
            if(numberArray.length == 1)
            {
                sum = Integer.parseInt(numberArray[0]);
            }
            else
            {
                for(String numString : numberArray )
                {
                    int num = Integer.parseInt(numString);
                    sum = sum + num;
                }
            }
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
       
    }
}
