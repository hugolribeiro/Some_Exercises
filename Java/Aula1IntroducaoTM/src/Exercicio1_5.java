// Desenvolver um programa para exibição por console os n primeiros números naturais que têm
// pelo menos de m dígitos de d, sendo n, m e d valores que o utilizador cai enviar pelo console.

// Por exemplo: se o usuário inserir n = 5, m = 2, e d = 3, o programa deve exibir os primeiros 5
// números naturais que tenham pelo menos 2 dígitos 3 no console. Neste caso, a saída será: 33, 133, 233, 303, 313.

import java.util.Scanner;

public class Exercicio1_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de n (quantidade de números): ");
        int n = sc.nextInt();
        System.out.print("Digite o valor de m (quantidade de dígitos): ");
        int m = sc.nextInt();
        System.out.print("Digite o valor de d (valor do dígito): ");
        int d = sc.nextInt();
        int appearedNumbers = 0;
        Integer actualNumber = (int) Math.pow(10, (m-1));
        char[] digits;

        while (appearedNumbers < n){
            digits = actualNumber.toString().toCharArray();
            int amountM = 0;
            for(char digit: digits){
                if (Character.getNumericValue(digit) == d){
                    amountM += 1;
                }
            }
            if (amountM >= m){
                System.out.print(actualNumber + " ");
                appearedNumbers += 1;
            }
            actualNumber += 1;
        }
        sc.close();
    }
}
