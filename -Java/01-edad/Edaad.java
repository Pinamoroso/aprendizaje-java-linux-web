/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.edaad;
import java.util.Scanner;
/*Ejercicio para saber si una persona es mayor o menor
/**
 *
 * @author pinamoroso
 */
public class Edaad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        
        System.out.print("Ingrese la edad ");
        a = sc.nextInt();
        
        if (a >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
