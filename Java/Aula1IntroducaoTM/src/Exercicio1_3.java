// Desenvolva um programa para informar se um número n é primo ou não
// sendo n um valor que o usuário irá inserir pelo console.

import java.util.Scanner;

public class Exercicio1_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite aqui um número: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n <= 1 || ((n % 2 == 0) && (n > 2))){
            isPrime = false;
        } else {
            int SquareRoot = (int) Math.sqrt(n);
            for (int actualDivisor = 3; actualDivisor <= SquareRoot; actualDivisor++){
                if (n % actualDivisor == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println("O número " + n + " é primo");
        } else{
            System.out.println("O número " + n + " não é primo!");
        }
        sc.close();
    }
}
