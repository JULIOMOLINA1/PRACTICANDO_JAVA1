package exercise1;

public class CuentaBancaria {
    public static double tasaInteresAnual = 0.08;
    public static int totalCuentas = 0 ;

    public String titular;
    public String numeroCuenta;
    public double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo){
        this.titular=titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        totalCuentas += 1;
    }

    public void aplicarInteresMensual(){
        double interesMensual = (saldo*(tasaInteresAnual/12));
        saldo += interesMensual;
    }

    public static void mostrarReporteBanco(){
        System.out.println("N° total de cuentas: " + totalCuentas);
    }

    public static void main (String[] args){
        CuentaBancaria cuenta1 = new CuentaBancaria("Julio", "1234567", 200);

        System.out.println(cuenta1.totalCuentas);
        CuentaBancaria cuenta2 = new CuentaBancaria("Vanessa", "2345678", 145);

        System.out.println(cuenta2.totalCuentas);

        CuentaBancaria cuenta3 = new CuentaBancaria("Julian", "9876543", 309);
        System.out.println(cuenta3.totalCuentas);
    }

}
