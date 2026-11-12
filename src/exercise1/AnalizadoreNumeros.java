package exercise1;

public class AnalizadoreNumeros {
    public void analizarrango(int inicio, int fin){
        int cantidadPares = 0;
        int sumaImpares = 0;

        while(inicio<=fin){
            if (inicio %2 ==0){
                cantidadPares++;
            } else {
                sumaImpares+=inicio;
            }
            inicio++;
        }
        System.out.println("N° pares: "+ cantidadPares);
        System.out.println("Suma impares: " + sumaImpares);
    }
    public static void main(String[]args){
        AnalizadoreNumeros nuevo1 = new AnalizadoreNumeros();
        nuevo1.analizarrango(4, 20);
    }
}
