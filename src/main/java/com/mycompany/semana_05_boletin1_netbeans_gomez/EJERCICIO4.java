/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_05_boletin1_netbeans_gomez;
import java.util.Scanner;

/**
 *Pedir dos números y decir si son iguales o no.
 * @author FRANZGOMEZ
 */
public class EJERCICIO4 {
  public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n1;
	int n2;
	System.out.print("Introduce un número: ");
	n1=teclado.nextInt();
	System.out.print("Introduce otro número: ");
	n2=teclado.nextInt();
	if(n1==n2)
            System.out.println("Son iguales");
	else
            System.out.println("No son iguales");
    }
} 

