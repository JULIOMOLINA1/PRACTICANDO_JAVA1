package exercise1;

public class Factura {
    public int numeroFactura;
    public double montoVenta;
    public final static double TASA_IGV = 0.18;

    public Factura(int numeroFactura, double montoVenta){
        this.numeroFactura = numeroFactura;
        this.montoVenta = montoVenta;
    }

    public double calcularMontoIGV(){
        return montoVenta*TASA_IGV;
    }
    public double calcularTotal(){
        double impuesto = calcularMontoIGV();
        double totalPagar = montoVenta + impuesto;
        return totalPagar;
    }
    public double calcularDescuento(double porcentaje){
        double totalDescuento = calcularTotal()*(porcentaje/100);
        return totalDescuento;
    }

    public void imprimirComprobante(){
        System.out.println("Numero factura: " + numeroFactura);
        System.out.println("Subtotal: " + montoVenta);
        System.out.println("IGV: " + calcularMontoIGV());
        System.out.println("Total: " + calcularTotal());
    }

    public static void main (String [] args){
        Factura factura1 = new Factura(345, 200);
        double totalPagar = factura1.calcularTotal()-factura1.calcularDescuento(10);
        factura1.imprimirComprobante();
        System.out.println("Descuento: " + factura1.calcularDescuento(10));
        System.out.println("Total con descuento: " + totalPagar);
    }
}
