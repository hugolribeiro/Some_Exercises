// Desenvolva um programa para mostrar por console os primeiros n números primos, sendo um
// valor que o usuário irá inserir pelo console.

import java.util.Scanner;

public class Exercicio1_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite aqui um número para ver os primeiros n números primos: ");
        int n = sc.nextInt();
        int appearedNumbers = 0;
        int actualNumber = 2;
        while (appearedNumbers < n){
            if (verifyPrime(actualNumber)){
                System.out.print(actualNumber + " ");
                appearedNumbers += 1;
            }
            actualNumber += 1;
        }
        sc.close();
    }

    public static boolean verifyPrime(int number){
        boolean isPrime = true;
        if (number <= 1 || ((number % 2 == 0) && (number > 2))){
            isPrime = false;
        } else {
            int squareRoot = (int) Math.sqrt(number);
            for (int actualDivisor = 3; actualDivisor <= squareRoot; actualDivisor++){
                if (number % actualDivisor == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}
