package exercise1;

import java.util.Scanner;

public class AnalizadorAvanzado {
    public static boolean esPrimo(int numero){
        boolean result = true;
        if(numero<=1){
            result = false;
        } else{
           for( int i = 2; i<=(int) Math.sqrt(numero); i++){
               if(numero %i ==0){
                   result = false;
               }
           }
        }
        return result;
    }

    public static void mostrarPrimosEnRango(int inicio, int fin){
        for(int i = inicio; i<=fin; i++){
            if(i%2==0 && i>2){
                continue;
            } else{
                if(esPrimo(i)){
                    System.out.print(i + "\t");
                }
            }
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero inicial del rango: ");
        int inicio = sc.nextInt();
        System.out.println("Ingresa el numero final del rango: ");
        int fin = sc.nextInt();
        System.out.println("Los numero primos del rango son: ");
        mostrarPrimosEnRango(inicio, fin);
    }
}
