/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_05_boletin1_netbeans_gomez;

import java.util.Scanner;



/**
 *Pedir dos números y decir cual es el mayor o si son iguales.
 * @author FRANZGOMEZ
 */
public class EJERCICIO8 {
public static void main(String[] args) {
Scanner teclado=new Scanner(System.in); 
 int n1,n2;
 System.out.print("Introduce un número: ");
 n1=teclado.nextInt();
 System.out.print("Introduce otro número: ");
 n2=teclado.nextInt();

 if(n1==n2)
 System.out.println("Son iguales");
 else
 {
 if(n1>n2)
 System.out.println(n1 + " es mayor que " + n2);
 else
 System.out.println(n2 + " es mayor que " + n1);
 }
 }
}
