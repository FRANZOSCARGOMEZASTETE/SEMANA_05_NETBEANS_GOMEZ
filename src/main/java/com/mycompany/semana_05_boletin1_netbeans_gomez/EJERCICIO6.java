/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana_05_boletin1_netbeans_gomez;

// Pedir dos números y decir si uno es múltiplo del otro.

import java.util.Scanner;

// Pedir dos números y decir si uno es múltiplo del otro.

/**
 *
 * @author FRANZGOMEZ
 */
public class EJERCICIO6 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int n1,n2;
        System.out.print("Introduce un número: ");
        n1=Entrada.nextInt();
        System.out.print("Introduce otro número: ");
        n2=Entrada.nextInt();
        
        if(n1 % n2 == 0){
            System.out.println("Son múltiplos");
        }else{
            System.out.println("No son múltiplos");
        }
    }
}