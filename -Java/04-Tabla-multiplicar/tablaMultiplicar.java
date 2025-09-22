package Java;

import java.util.Scanner;
public class tablaMultiplicar{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingrese tabla de multiplicar");
        n = sc.nextInt();

        for(int a=1; a<=10; a++){
            System.out.println(n + " x " + a + " = " + (n*a)); //N es una constante no cambia 

}

}
}