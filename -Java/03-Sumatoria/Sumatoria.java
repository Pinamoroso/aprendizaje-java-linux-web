package Java;

//Programa que Pide un número n y calcula la suma de 1 + 2 + 3 + ... + n.

import java.util.Scanner; 
public class Sumatoria {
    public static void main(String [] args) {
      Scanner sc = new Scanner(System.in);
       int a, suma=0, q=1;
       System.out.println("Dame un numero");
       a = sc.nextInt();
 
       while(q <= a) {
        suma = suma + q; //acumulamos
        q++; //avanza al siguiente numero
}
System.out.println("Suma " + suma);
}
}
