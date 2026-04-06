package com.mycompany.mavenproject1;
import java.lang.Math;
import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com os 3 nums: ");
        int num = teclado.nextInt();
        int inter1 = teclado.nextInt();
        int inter2 = teclado.nextInt();
        if (num >= inter1 && num <= inter2)
            System.out.println("Está no intervalo");
        else
            System.out.println("Não está no intervalo");
    }
}
