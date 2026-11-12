package exercise1;

import java.util.ArrayList;
import java.util.List;

public class Capicua {

    public boolean esCapicua( int number){
        boolean esCapicua = false;
        int numInvertido = 0;
        int numberTemporal = number;
        List<Integer> digitos = new ArrayList<>();

        while(numberTemporal>0){
            digitos.add(numberTemporal%10);
            numberTemporal/=10;
        }

        for(int pos =0; pos<=digitos.size() -1; pos++){
            numInvertido += digitos.get(pos)*Math.pow(10, digitos.size()-pos-1);
        }

        if(number==numInvertido){
            esCapicua=true;
        }

        return  esCapicua;
    }
}
