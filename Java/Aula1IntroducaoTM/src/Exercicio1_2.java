// Desenvolva um programa para mostrar os primeiros n números múltiplos de m,
// sendo n e m valores que o usuário irá inserir via console.

import java.util.Scanner;

public class Exercicio1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de m: ");
        int m = sc.nextInt();
        System.out.print("Digite a quantidade de numeros que gostaria de ver: ");
        int n = sc.nextInt();
        int appearedNumbers = 0;
        int actualNumber = 1;

        while (appearedNumbers < n){
            if (actualNumber % m == 0){
                System.out.print(actualNumber + " ");
                appearedNumbers += 1;
            }
            actualNumber += 1;
        }
        sc.close();
    }
}
