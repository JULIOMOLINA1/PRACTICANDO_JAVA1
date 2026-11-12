package exercise1;

public class Bicicleta {
    public String marca;
    public String color;
    public int velocidadActual;
    public int marcha;

    public Bicicleta(String marca, String color, int velocidadActual, int marcha) {
        this.marca = marca;
        this.color = color;
        this.velocidadActual = velocidadActual;
        this.marcha = marcha;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidadActual);
        System.out.println("Marcha: " + marcha);
    }

    public void pedalear(int incremento) {
        velocidadActual += incremento;
    }
    public static void main (String []args) {
        Bicicleta myBicycle = new Bicicleta("Fox", "Black", 23, 23);
        Bicicleta newBicycle = new Bicicleta("March", "Brown", 25, 32);
        myBicycle.color = "Red";
        newBicycle.marcha = 36;
        myBicycle.pedalear(20);
        myBicycle.mostrarDetalles();
        newBicycle.mostrarDetalles();
    }

}
