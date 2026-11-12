package exercise1;

import java.util.Scanner;

public class ManipuladorDigitos {

    public static int sumarDigitos(int numero){
        int numeroTemporal=numero;
        int sumadigitos =0;
        while(numeroTemporal>0){
            sumadigitos += numeroTemporal%10;
            numeroTemporal/=10;
        }
        return sumadigitos;
    }
    public static int obtenerDigitoMayor(int numero){
        int numeroTemporal = numero;
        int digitoMayor = 0;
        int digitoComparar;
        while(numeroTemporal>0){
            digitoComparar= numeroTemporal%10;
            numeroTemporal/=10;
            digitoMayor = Math.max(digitoMayor, digitoComparar);
        }
        return digitoMayor;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int numero = sc.nextInt();
        System.out.println("La suma de sus digitos es: " +ManipuladorDigitos.sumarDigitos(numero));
        System.out.println("El digito mayor es: "+ ManipuladorDigitos.obtenerDigitoMayor(numero));
    }
}
