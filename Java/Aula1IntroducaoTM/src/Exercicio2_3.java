/*
Para um protótipo de supermercado, crie um programa que leia 3 produtos e imprima no console:
nome, preço, quantidade e o valor total da compra.

Produto 1
Arroz
R$10.99
Quantidade: 2

Produto 2
Feijao
R$ 14.49
Quantidade: 1

Produto 3
Tomate
R$ 9.99
Quantidade: 5

Valor Total: R$86.42
 */

import entities.Product;

import java.util.Scanner;

public class Exercicio2_3 {
    public static void main(String[] args){
        Product[] array = new Product[3];
        Scanner sc = new Scanner(System.in);
        for (int index=0; index < 3; index++){
            System.out.println("Digite as informações do produto " + (index+1) + ": ");
            System.out.print("Nome: ");
            String productName = sc.nextLine();
            System.out.print("Valor: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantidade: ");
            int productAmount = sc.nextInt();
            sc.nextLine();
            Product actualProduct = new Product(productName, productPrice, productAmount);
            array[index] = actualProduct;
            System.out.println();
        }
        double totalPrice = 0;
        for (Product product: array){
            System.out.println(product.toString());
            totalPrice += product.subTotal();
        }
        System.out.println("Valor Total: " + totalPrice);
        sc.close();
    }
}
