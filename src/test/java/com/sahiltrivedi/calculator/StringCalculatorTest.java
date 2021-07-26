/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sahiltrivedi.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Trivedi
 */
public class StringCalculatorTest {
    
    public StringCalculatorTest() {
    }
    
    private static StringCalculator strCal;
    
    @BeforeAll
    public static void setUpClass() {
        strCal = new StringCalculator();
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Add method, of class StringCalculator.
     */
    
    @Test
    public void emptyStringReturnZero() {
        
        int expResult = 0;
        String numbers = "";
        int result = strCal.Add(numbers);
        assertEquals(expResult, result);      
    }
    @Test
    public void nullStringReturnZero() {
        
        int expResult = 0;
        String numbers = null;
        int result = strCal.Add(numbers);
        assertEquals(expResult, result);      
    }
    @Test
    public void singleNumberReturnItself() {
                
        String numbers = "5";
        int expResult = Integer.parseInt(numbers);
        int result = strCal.Add(numbers);
        assertEquals(expResult, result);      
    }
    @Test
    public void returnTotalSumOfNumber() {
                
        String numbers = "1,2";
        int expResult = 1 + 2;
        int result = strCal.Add(numbers);
        assertEquals(expResult, result);      
    }
    @Test
    public void returnTotalWhenHaveNewLine() {
                
        String numbers = "1,2\n3";
        int expResult = 1 + 2 + 3;
        int result = strCal.Add(numbers);
        assertEquals(expResult, result);      
    }
    @Test
    public void identifyDelimeterAndReturnTotal() {
                
        String numbers = "//;\n1;2";
        int expResult = 1 + 2;
        int result = strCal.Add(numbers);
        assertEquals(expResult, result);      
    }
    @Test
    public void customDelimeterWithNewLineReturnTotal() {
                
        String numbers = "//;\n1;2;3\n4";
        int expResult = 1 + 2 + 3 + 4;
        int result = strCal.Add(numbers);
        assertEquals(expResult, result);      
    }
    @Test
    public void negativeNumberThrowException(){
                
        String numbers = "//;\n1;-2;-3\n4";
        String expResult = ("negative not allowed -2,-3");
        Exception ex = null;
        try {
           strCal.Add(numbers);
        } catch (Exception exp) {
            
            ex = exp;
        }
        if(ex != null)
            assertEquals(expResult, ex.getMessage());
        else
            fail("No Exception Thrown");
    }
}
