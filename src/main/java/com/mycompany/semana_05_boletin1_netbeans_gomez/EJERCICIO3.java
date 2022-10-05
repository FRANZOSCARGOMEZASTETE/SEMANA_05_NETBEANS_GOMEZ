/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_05_boletin1_netbeans_gomez;
import java.util.Scanner;

/**
 *Pedir el radio de una circunferencia y calcular su longitud.
 * @author FRANZGOMEZ
 */
public class EJERCICIO3 {
    
   public static void main(String[] args) {
        Scanner arje=new Scanner (System.in);
        System.out.println("Ingrese el radio: ");
        int radio=arje.nextInt();
        double longitud=radio*2*(3.1415);
        System.out.println("Longitud es de= "+longitud+" cm ");
    }
    
}
