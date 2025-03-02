/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.letradni;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 1-DAM
 */
public class LetraDNITest {
    
    public LetraDNITest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of main method, of class LetraDNI.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LetraDNI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adivinarNumeroDNI method, of class LetraDNI.
     */
    @org.junit.jupiter.api.Test
    public void testAdivinarNumeroDNI() {
        System.out.println("adivinarNumeroDNI");
        int numericoDNI = 0;
        char expResult = ' ';
        char result = LetraDNI.adivinarNumeroDNI(numericoDNI);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprobarDNI method, of class LetraDNI.
     */
    @org.junit.jupiter.api.Test
    public void testComprobarDNI() {
        System.out.println("comprobarDNI");
        String dni = "";
        boolean expResult = false;
        boolean result = LetraDNI.comprobarDNI(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerLetraDNI method, of class LetraDNI.
     */
    @org.junit.jupiter.api.Test
    public void testObtenerLetraDNI() {
        System.out.println("obtenerLetraDNI");
        int numericoDNI = 987654332;
        String dni="987654332 ";
        String expResult = "B";
        
        String result = LetraDNI.obtenerLetraDNI(numericoDNI, dni);
        assertEquals(expResult, result);
    }
    
}
