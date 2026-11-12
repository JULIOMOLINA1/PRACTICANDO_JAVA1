package exercise1;

import java.util.Scanner;

public class JuegoAdivinanza {
    public static int generarNumeroSecreto(int min, int max){
        return (int) (Math.random()*(max - min + 1) + min);
    }
    public static void main (String[] args){
        int numeroSecreto = JuegoAdivinanza.generarNumeroSecreto(1, 20);
        int contadorIntentos = 1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Adivina el numero: ");
            int intento = sc.nextInt();
            if(intento>numeroSecreto){
                System.out.println("Mas bajo.");
            }else if(intento<numeroSecreto){
                System.out.println("Mas alto");
            } else if (intento == numeroSecreto){
                System.out.println("Correcto.");
                System.out.println("N° intentos: " + contadorIntentos);
                break;
            } else{
                System.out.println("Error. Numero ingresado incorrecto.");
            }
            contadorIntentos++;
        } while(contadorIntentos<=5);
        if(contadorIntentos>5){
            System.out.println("Perdiste. Ya tienes mas de 5 intentos.");
        }

    }

}
