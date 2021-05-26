package introduccion;

import java.util.Scanner;

import static introduccion.ej3.esPrimo;

public class ej4 {

    public static void primeroNPrimos(int cantidad){
        int i = 1;
        while(cantidad>0){
            if(esPrimo(i) == -1){
                System.out.println(i);
                cantidad--;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero n para mostrar los primeros n primos");
        primeroNPrimos(scanner.nextInt());
        scanner.close();
    }
}
