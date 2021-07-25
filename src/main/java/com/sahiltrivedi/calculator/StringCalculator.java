/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sahiltrivedi.calculator;

import java.util.regex.Pattern;

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
            else if(Pattern.matches("[0-9]", numberArray[0]) == false)
            {
                String delimeter = numberArray[0].substring(2);
                String[] tempNumberArray = numbers.split("\n",2);
                numberArray = tempNumberArray[1].split(delimeter);
                sum = totalSum(numberArray);
            }
            else
            {
                sum = totalSum(numberArray);
                /*
                for(String numString : numberArray )
                {
                    int num = Integer.parseInt(numString);
                    sum = sum + num;
                }
                */
            }
        }
        
        return sum;
    }
    
    private int totalSum(String[] numberArray)
    {
        int sum = 0;
        for(String numString : numberArray )
            {
                int num = Integer.parseInt(numString);
                sum = sum + num;
            }
        return sum;
    }
    
    public static void main(String[] args) {
       
    }
}
