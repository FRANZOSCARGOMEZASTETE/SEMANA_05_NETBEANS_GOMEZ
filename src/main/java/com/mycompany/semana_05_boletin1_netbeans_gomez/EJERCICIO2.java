/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_05_boletin1_netbeans_gomez;
import java.util.Scanner;

/**
 *Pedir el radio de un círculo y calcular su área. A=PI*r^2.
 * @author FRANZGOMEZ
 */
public class EJERCICIO2  {
    public static void main(String[] args) {
        double area, radio;
        Scanner num = new Scanner(System.in);
        try {
            System.out.print("Introduce el radio de un Círculo: ");
            radio = num.nextDouble();
            area = Math.PI*(radio*radio);
            System.out.println("El área del Círculo es: " + area);
        } catch (Exception e) {
        }        
    }
}