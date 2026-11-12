package exercise1;

public class Geometria {
    public double calcularArea( int opcion, double dato1, double dato2){
        double resultado;
        switch(opcion){
            case 1: resultado = Math.PI*Math.pow(dato1, 2);
                    break;
            case 2: resultado = dato1*dato2;
                    break;
            case 3: resultado = (dato1*dato2)/2;
                    break;
            default: System.out.println("Opción no valida");
                    resultado = 0.0;
        }
        return resultado;
    }


    public static void main (String [] args) {
        Geometria problema1 = new Geometria();
        System.out.println(Math.round(problema1.calcularArea(1, 5, 6)));
        System.out.println(Math.round(problema1.calcularArea(2, 5, 6)));
        System.out.println(Math.round(problema1.calcularArea(3, 5, 6)));
    }

}
