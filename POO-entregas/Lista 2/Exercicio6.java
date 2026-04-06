package com.mycompany.mavenproject1;
import java.lang.Math;
import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o nome: ");
        String nome = teclado.nextLine();
        System.out.println("Entre com o preço: ");
        float preco = teclado.nextInt();
        System.out.println("Entre com a quantidade :");
        int quant = teclado.nextInt();
        if (quant <= 10)
            System.out.println("Preço = "+preco);
        else if (11 <= quant && quant <= 20)
            System.out.println("Preço = "+(preco*0.9));
        else if (21 <= quant && quant <= 50)
            System.out.println("Preço = "+(preco*0.8));
        else
            System.out.println("Preço = "+(preco*0.75));
    }
}
