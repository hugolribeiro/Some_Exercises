/*
Dado um vetor de 10 posições, sendo respectivamente ocupado pelos valores:
52, 10, 85, 1324, 01, 13, 62, 30, 12 e 127

Imprima no console:
a) Sua ordenação crescente
b) Sua ordenação decrescente
 */

import java.util.Arrays;
import java.util.Collections;

public class Exercicio2_1 {
    public static void main(String[] args){
        Integer[] numbers = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
        Arrays.sort(numbers);
        for (Integer number: numbers){
            System.out.print(number + " ");
        }
        System.out.println();
        Arrays.sort(numbers, Collections.reverseOrder());
        for (Integer number: numbers){
            System.out.print(number + " ");
        }
    }
}
