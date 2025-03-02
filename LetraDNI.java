/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.letradni;

/**
 *
 * @author 1-DAM
 */
public class LetraDNI {

   public static void main(String[] args) {
       
    }
    
    public static char adivinarNumeroDNI(int numericoDNI){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra = letras.charAt(numericoDNI % letras.length());
        return letra;
    }
    
    public static boolean comprobarDNI(String dni){
        
        char letraDNI;
        String numericoDNI;
        char letra;
        if (dni.length()!=9||Character.isLetter(dni.charAt(8))==false){
            System.out.println("Longitud invalida o no hay letra en el caracter final, la letra no es correcta");
            return false;
        }
        
        letraDNI=dni.charAt(8);
        numericoDNI=(String) dni.subSequence(0, 7);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        letra = letras.charAt(Integer.parseInt(numericoDNI) % letras.length());
        
        if (letraDNI==letra){
            return true;
        } else {
            return false;
        }
    }

public static String obtenerLetraDNI (int numericoDNI, String dni) {
    
    String LetraDNI = "";
    
if (numericoDNI != 8){
 numericoDNI = Integer.parseInt(dni.substring(8));
int resto = 0;

String[] letra = {"T","R","W","A", "G","M","y","f","P","D","X","B","N","J","Z","S","Q","N", "J", "Z", "S","Q","V","H","L","C","K","E"};
resto = numericoDNI %23;
letra = letra;
       }
return LetraDNI;
   }
}
