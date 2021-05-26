package introduccion;

import java.util.Scanner;

public class ej3 {

    public static int esPrimo(int x){
        if(x == 1){
            return -1;
        }
        int raizN = (int)Math.ceil(Math.sqrt(x));
        for(int i = 2;i<=raizN;i++){
            if(x%i == 0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero para ver si es primo o no");
        int x = scanner.nextInt();
        int res = esPrimo(x);
        if(res == -1){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo porque "+x+"/"+res+" es igual a 0");
        }
        scanner.close();
    }
}
