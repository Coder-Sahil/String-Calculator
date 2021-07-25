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
    
    
   
    
}
