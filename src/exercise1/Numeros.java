package exercise1;

public class Numeros {
    public static void generarFibonacci(int number){
        if (number>=3) {
            int a = 0, b =1, k =2, c=0;
            System.out.print(a + "\t" + b);

                do {
                    k++;
                    c = a + b;
                    System.out.print("\t" + c);
                    a = b;
                    b = c;
                } while (k < number);
        } else {
            System.out.println("The number must be greater than 2.");
        }
    }

    public static void main(String []args){
        generarFibonacci(3);
    }
}
