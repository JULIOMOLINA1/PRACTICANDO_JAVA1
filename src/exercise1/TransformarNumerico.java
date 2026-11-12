package exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TransformarNumerico {
    public static List<Integer> obteneDigitosPares(int numero){
        int numeroTemporal = numero;
        List<Integer> digitosPares = new ArrayList<>();
        while(numeroTemporal>0){
            int digitoEvaluado = numeroTemporal%10;
            if(digitoEvaluado%2==0){
                digitosPares.add(digitoEvaluado);
            }
            numeroTemporal/=10;
        }
        Collections.reverse(digitosPares);
        return digitosPares;
    }
    public static int construirNumeroDesdeLista(List<Integer> digitos){
        int numeroReconstruido =0;
        for(int i = 0; i<digitos.size(); i++){
            numeroReconstruido += digitos.get(i)*Math.pow(10, digitos.size()-i-1);
        }
        return numeroReconstruido;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero a evaluar: ");
        int numeroEvaluar = sc.nextInt();
        System.out.println("Lista de numeros pares: " + obteneDigitosPares(numeroEvaluar));
        System.out.println("Nuevo entero formado: " + construirNumeroDesdeLista(obteneDigitosPares(numeroEvaluar)));
    }
}
