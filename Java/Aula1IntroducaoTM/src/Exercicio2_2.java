/*
Em 2021 uma startup de tecnologia denominada de "Empresa X" é avaliada em 1,13 milhão e possui
uma média de crescimento anual de 148%, uma concorrente do ramo, "Empresa Y", é avaliada
em 18,4 milhões e com sua média de crescimento anual em 32%.

Empresa X - 01/01/2021 - Valor da empresa: 1,13m
Empresa Y - 01/01/2021 - Valor da empresa: 18.4m

Considerando este cenário, imprima no console (conforme formatação acima) a evolução
anual até que a empresa X ultrapasse a empresa Y em seu valor de empresa.
 */

public class Exercicio2_2 {
    public static void main(String[] args){
        int actualYear = 2021;
        double valueCompanyX = 1.13;
        double valueCompanyY = 18.4;

        while (valueCompanyX <= valueCompanyY){
            System.out.printf("Empresa X - 01/01/%d - Valor da empresa: %.2fm%n", actualYear, valueCompanyX);
            System.out.printf("Empresa Y - 01/01/%d - Valor da empresa: %.2fm%n", actualYear, valueCompanyY);
            valueCompanyX = valueCompanyX + (valueCompanyX * 1.48);
            valueCompanyY = valueCompanyY + (valueCompanyY * 0.32);
            actualYear += 1;
        }
        System.out.println("-------------- A empresa X ultrapassou a empresa Y ---------------");
        System.out.printf("Empresa X - 01/01/%d - Valor da empresa: %.2fm%n", actualYear, valueCompanyX);
        System.out.printf("Empresa Y - 01/01/%d - Valor da empresa: %.2fm%n", actualYear, valueCompanyY);
    }
}
