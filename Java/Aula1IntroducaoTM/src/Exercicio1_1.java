// Desenvolva um programa para mostrar os primeiros n números pares,
// sendo n um valor que o usuário irá inserir pelo console.

import java.util.Scanner;

public class Exercicio1_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira até qual número gostaria de visualizar os números pares: ");
        int amountNumbers = sc.nextInt();
        for (int actualNumber=0; actualNumber < amountNumbers*2; actualNumber += 2){
            System.out.print(actualNumber + " ");
        }
        sc.close();
    }
}
