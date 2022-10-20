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
        var numero=0;
        //leer datos del teclado
      do{
        var lectura = new Scanner(System.in);
        
        System.out.println("Ingresar numeros menores a 10");
        numero=lectura.nextInt();
        System.out.println("numero = " + numero);
      } while(numero<10);   
      
      for ( var i = 0;  i< 10; i++){
        System.out.println("Hola " + 1);
      }
      var numeroList = new int[5];
      numeroList[0]=7;
      numeroList[1]=9;
      numeroList[2]=4;
      numeroList[3]=11;
      numeroList[4]=3;
      
      var numeroDecimalList = new double[5];
      numeroDecimalList[0]=8.5;
      numeroDecimalList[1]=4.0;
      numeroDecimalList[2]=9.3;
      numeroDecimalList[3]=6.4;
      numeroDecimalList[4]=3.9;
      
      System.out.println(numeroList[0]);
      System.out.println(numeroList[1]);
      System.out.println(numeroList[2]);
      System.out.println(numeroList[3]);
      System.out.println(numeroList[4]);
      
      System.out.println(numeroDecimalList[0]);
      System.out.println(numeroDecimalList[1]);
      System.out.println(numeroDecimalList[2]);
      System.out.println(numeroDecimalList[3]);
      System.out.println(numeroDecimalList[4]);
      
      
    }           
}
