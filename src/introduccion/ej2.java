package introduccion;

import java.util.Scanner;

public class ej2 {

    public static void mostrarPrimerosNMultiplos(int numero, int cantidad){

        for(int i = 1; i <= cantidad; i++){
            System.out.println(numero*i);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mostrarPrimerosNMultiplos(scanner.nextInt(), scanner.nextInt());
        scanner.close();
    }
}
