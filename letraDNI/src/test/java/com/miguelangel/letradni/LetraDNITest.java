/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.miguelangel.letradni;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Miguel Ángel y Antonio Miguel
 * @version 2.0
 * @since 01-03-2025
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
     * Test de la clase principal.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LetraDNI.main(args);
    }

    /**
     * Test en el que se adivina la letra del dni.
     */
    @org.junit.jupiter.api.Test
    public void testAdivinarNumeroDNI() {
        System.out.println("adivinarNumeroDNI");
        int numericoDNI = Integer.parseInt("00000022");
        char expResult = 'E';
        char result = LetraDNI.adivinarNumeroDNI(numericoDNI);
        assertEquals(expResult, result);
    }

    /**
     * Test en el que se comprueba si el dni es correcto o no.
     */
    @org.junit.jupiter.api.Test
    public void testComprobarDNI() {
        System.out.println("comprobarDNI");
        String dni = "56546777";
        boolean expResult = false;
        boolean result = LetraDNI.comprobarDNI(dni);
        assertEquals(expResult, result);
    }

    /**
     * Test de obtener la letra del dni a partir del numero proporcionado.
     */
    @org.junit.jupiter.api.Test
    public void testObtenerLetraDNI() {

        int numericoDNI = Integer.parseInt("22222222");
        String expResult = "J";

        String result = LetraDNI.obtenerLetraDNI(numericoDNI);

        assertEquals(expResult, result, "La letra obtenida no es la esperada.");
    }
    
}

