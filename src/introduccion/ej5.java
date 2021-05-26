package introduccion;

import java.util.Scanner;

import static introduccion.ej3.esPrimo;

public class ej5 {

    public static int cantApariciones(String numeroLargo, char digito){

        int res = 0;
        for(char actual : numeroLargo.toCharArray()){
            if (actual == digito) {
                res++;
            }
        }
        return res;
    }
    public static void ejercicio5(int cantidad, int repeticiones, int digito){
        Integer i = 0;
        while(cantidad>0){
            String sNumero = i.toString();
            if(cantApariciones(sNumero, (char)(digito+'0')) == repeticiones){
                System.out.println(sNumero);
                cantidad--;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos numeros");
        int cantidad = scanner.nextInt();
        System.out.println("Cuantas aparaciones del digito");
        int reps = scanner.nextInt();
        System.out.println("Que digito");
        int digito = scanner.nextInt();
        ejercicio5(cantidad, reps, digito);
        scanner.close();
    }
}
