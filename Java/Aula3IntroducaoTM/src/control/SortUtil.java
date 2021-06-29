package control;

import boundary.Precedente;

public class SortUtil {

    public static <T> void organiza(Precedente<T>[] vet){
        Precedente<T> aux;
        int length = vet.length;
        int i = 0;

        for(i = 0; i<length; i++){
            for(int j = 0; j<length-1; j++){
                if(vet[j].precedeA((T)  vet[j + 1]) >= 1){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
    }
}
