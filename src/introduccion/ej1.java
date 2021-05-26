package introduccion;

import java.util.Scanner;

public class ej1 {

    public static void mostrarNPares(int n){

        for(int i = 0; i < n; i++){
            System.out.println(2*i);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero n para mostrar los primeros n numeros pares");
        mostrarNPares(scanner.nextInt());
        scanner.close();
    }

}
