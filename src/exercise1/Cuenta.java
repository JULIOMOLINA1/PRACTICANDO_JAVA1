package exercise1;

import java.util.Scanner;

public class Cuenta {
    public String titular;
    public int pin;
    public double saldo;

    public Cuenta(String titular, int pin, double saldo){
        this.titular = titular;
        this.pin = pin;
        this.saldo = saldo;
    }

    public boolean validarPin(int pinIngresado){
        return pinIngresado == pin;
    }

    public void depositar(double monto){
        if (monto >0) {
            saldo += monto;
        } else {
            System.out.println("Monto ingresado incorrecto.");
        }
    }

    public void retirar(double monto){
        if(saldo>0 && saldo>=monto){
            saldo-=monto;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public static void main (String[]args){
        Cuenta cuentaNuevo = new Cuenta("Julio Molina", 1234, 1000);
        Scanner sc = new Scanner(System.in);
        int intentos=0;
        while(intentos<3){
            System.out.println("Ingresa el PIN de la cuenta: ");
            int pinIngresado = sc.nextInt();
            if(cuentaNuevo.validarPin(pinIngresado)){
                boolean controlador=true;
                do{
                    System.out.println("Menu:");
                    System.out.println("1. Consultar saldo.");
                    System.out.println("2. Depositar.");
                    System.out.println("3. Retirar.");
                    System.out.println("4. Salir.");
                    System.out.println("Ingresa tu opción: ");
                    int opcion = sc.nextInt();
                    switch(opcion){
                        case 1: System.out.println("Saldo: "+cuentaNuevo.saldo);
                                break;
                        case 2: System.out.println("Ingresa la cantidad a depositar: ");
                                double montoDeposito = sc.nextDouble();
                                cuentaNuevo.depositar(montoDeposito);
                                break;
                        case 3: System.out.println("Ingresa el monto a retirar: ");
                                double montoRetirar = sc.nextDouble();
                                cuentaNuevo.retirar(montoRetirar);
                                break;
                        case 4: controlador=false;
                                return;
                        default: System.out.println("Opcion ingresada incorrecta. Vuelve a intentar. ");
                                break;
                    }
                }while(controlador);
            } else{
                System.out.println("PIN ingresado incorrecto.");
            }
            intentos++;
        }
        System.out.println("Tienes mas de 3 intentos.");
    }
}
