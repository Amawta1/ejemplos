/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author amawta fajardo
 */
public class AmawtaFajardo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*var a = 0;
        while (a < 10) {
            System.out.println("a " + a);
            a += 1;
        }
        System.out.println(" Ingrese numeros");
        var lectura = new Scanner(System.in);
        var numero = lectura.nextInt();
        while (numero < 10) {
            System.out.println(" Ingrese numeor valido");
            lectura = new Scanner(System.in);
            numero = lectura.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("XD \n");
        }
        var numeros = new int[5];
        numeros[0] = 7;
        numeros[1] = 5;
        numeros[2] = 4;
        numeros[3] = 8;
        numeros[4] = 9;
        for (int i = 0; i < 5; i++) {
            System.out.println("posicion "+(i+1)+": "+numeros[i]);
        }
        var decimalList = new double[3];
        decimalList[0] = 1.4;
        decimalList[1] = 1.2;
        decimalList[2] = 2.4;
        for (int i = 0; i < 3; i++) {
            System.out.println("posicion "+(i+1)+": "+decimalList[i]);
        }*/


        
        System.out.println(" Ingrese la dimensión del arreglo ");
        var dimension = new Scanner(System.in);
        var valor = dimension.nextInt();
        var num = new int[valor];
        var x=valor;
        var variable=0;
        for (int i = 0; i < x; i++) {
            System.out.println("Ingrese el valor de la posicion "+(i+1)+": ");
            var leer = new Scanner(System.in);
            variable = leer.nextInt();
            num[i]=variable;
        }
         System.out.println("Los numeros ingresados son: ");
        for(int i = 0; i < x; i++) {
        System.out.println(num[i]);
        }
    }
}
