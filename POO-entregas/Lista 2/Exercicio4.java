package com.mycompany.mavenproject1;
import java.lang.Math;
import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com a distância: ");
        float dist = teclado.nextFloat();
        System.out.println("Entre com a gas consumida: ");
        float gas = teclado.nextFloat();
        System.out.println("Entre com o tempo: ");
        float temp = teclado.nextFloat();
        System.out.println("Vmédia = "+(dist/temp));
        System.out.println("Consumo = "+(gas/dist));
    }
}
