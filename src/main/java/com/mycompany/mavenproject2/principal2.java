/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author amawta
 */
public class principal2 {
    
    public static void maind(String[]args){
        
        var a=0;
        System.out.println("a = " + a);
        
        a++;
        System.out.println("a = " + a);
        
        a++;
        System.out.println("a = " + a);
        
        a++;
        System.out.println("a = " + a);
        
        a++;
        System.out.println("a = " + a);
        
        a++;
        System.out.println("a = " + a);
        
        while(a<=10){
            a++;
            System.out.println("a = " + a);
        }
        //leer datos del teclado
        var lectura = new Scanner(System.in);
        
        System.out.println("Ingresar numeros menores a 10");
        var numero=lectura.nextInt();
        System.out.println("numero = " + numero);
        
    }           
}
