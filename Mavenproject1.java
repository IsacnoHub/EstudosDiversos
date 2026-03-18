package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Mavenproject1 {
    public static void main(String[] args) {
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("O nome é: "+nome);  
        */
        
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite a temperatura em Celsius: ");
//        float temp = teclado.nextFloat();
//        float antigo = temp;
//        temp = (temp*1.8f)+32;
//        System.out.println(antigo+"*C equivale a: "+temp+"*F");
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Entre com o número: ");
//        int num = teclado.nextInt();
//        if (num%2 == 0){
//            System.out.println("É par");
//        }
//        else{
//            System.out.println("É ímpar");
//        }
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com um valor: ");
        float real = teclado.nextFloat();
        
        int centavos = Math.round(real * 100);
        int Um = centavos/100;
        centavos = centavos%100;
        int Cin = centavos/50;
        centavos = centavos%50;
        int Vin = centavos/25;
        centavos = centavos%25;
        int Dez = centavos/10;
        centavos = centavos%10;
        int Co = centavos/5;
        centavos = centavos%5;
        int um = centavos/1;
        centavos = centavos%1;
        
        System.out.println("Moedas de um: "+Um);
        System.out.println("Moedas de 50: "+Cin);
        System.out.println("Moedas de 25: "+Vin);
        System.out.println("Moedas de 10: "+Dez);
        System.out.println("Moedas de 5: "+Co);
        System.out.println("Moedas de 1: "+um);
    }
}
