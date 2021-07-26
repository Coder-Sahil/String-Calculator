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
    
    public int Add(String numbers) throws Exception
    {
        int sum = 0;
        try
        {
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
                    String customDelimeter = numberArray[0].substring(2);
                    String delimeter = "[" + customDelimeter + "\n" +"]";
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
        }
        catch(Exception exp)
        {
            throw exp;
        }
        return sum;
    }
    
    private int totalSum(String[] numberArray) throws Exception
    {
        int sum = 0;
        String negativeNumbers = "";
        boolean negativeFound = false; 
        for(String numString : numberArray )
            {
                int num = Integer.parseInt(numString);
                if(checkNegative(num))
                {
                    negativeFound = true;
                    negativeNumbers += numString + ",";
                }
                else
                {
                    sum = sum + num;
                }                
            }
        if(negativeFound)
                    throw new Exception("negative not allowed " + negativeNumbers.substring(0, negativeNumbers.length() - 1));
        
        return sum;
    }
    
    private boolean checkNegative(int number)
    {
        boolean isNegative = false;
        if(number < 0)
            return isNegative = true;
        else
            return isNegative;
    }
    
    public int GetCalledCount()
    {
        return -1;
    }
    
    public static void main(String[] args) {
       
    }
}
