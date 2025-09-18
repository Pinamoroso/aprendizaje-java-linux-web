/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nummayor;
import java.util.Scanner;
 /*Programa que diga que numero es mayor 
/**
 *
 * @author pinamoroso
 */
public class Nummayor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a, b;
        
        System.out.println("Ingrese el primer numero ");
        a = sc.nextDouble();
        
        System.out.println("Ingrese el segundo numero ");
        b = sc.nextDouble();
        
        if(a > b){
        System.out.println("El primero numero es mayor");
    } else {
            System.out.println("El segundo numero es mayor ");
        } }
}