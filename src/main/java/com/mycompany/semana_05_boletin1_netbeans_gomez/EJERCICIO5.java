/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_05_boletin1_netbeans_gomez;

import java.util.Scanner;

/**
 * Pedir un número e indicar si es positivo o negativo.
 * @author FRANZGOMEZ
 */
public class EJERCICIO5 {
public static void main(String[]args){
     Scanner teclado=new Scanner(System.in);
     int a;
     System.out.println("Ingrese un numero: ");
     a=teclado.nextInt();
     if(a>0)
       System.out.println("es positivo ");
     else
     System.out.println("es negativo ");
     }
}