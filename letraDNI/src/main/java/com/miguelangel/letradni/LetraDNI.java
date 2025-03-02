/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.miguelangel.letradni;

/**
 * Proyecto en el que se obtiene la letra a partir de su parte numerica y se
 * comprueba si el dni proporcionado es verídico o no
 *
 * @author Miguel Ángel y Antonio Miguel
 * @version 2.0
 * @since 20-02-2025
 */
public class LetraDNI {

    /**
     * El proyecto solo se compone de los métodos, aunque se podría llamarlos
     * desde el método principal
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    /**
     * Metodo en el que se proporciona el numero del dni y se adivina su letra
     * @param numericoDNI
     * @return letra
     */
    public static char adivinarNumeroDNI(int numericoDNI) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra = letras.charAt(numericoDNI % 23);
        return letra;
    }

    /**
     * Metodo en el que se comprueba la vericidad del dni
     * @param dni
     * @return si es veraz, se devuelve true, si no, se devuelve false
     */
    public static boolean comprobarDNI(String dni) {

        if (dni.length() != 9 || !Character.isLetter(dni.charAt(8))) {
            System.out.println("Longitud inválida o formato incorrecto.");
            return false;
        }

        char letraDNI = Character.toUpperCase(dni.charAt(8));
        int numericoDNI;

        try {
            numericoDNI = Integer.parseInt(dni.substring(0, 8));
        } catch (NumberFormatException e) {
            System.out.println("El número del DNI no es válido.");
            return false;
        }

        return adivinarNumeroDNI(numericoDNI) == letraDNI;
    }

    /**
     * Metodo en el que se adivina la letra del dni
     * @param numericoDNI
     * @return String.valueOf(adivinarNumeroDNI(numericoDNI))
     */
    public static String obtenerLetraDNI(int numericoDNI) {
        return String.valueOf(adivinarNumeroDNI(numericoDNI));
    }
}
