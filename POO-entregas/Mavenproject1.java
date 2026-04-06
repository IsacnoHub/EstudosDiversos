package com.mycompany.olamundo;
import java.util.Scanner;
public class OlaMundo{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("O nome é: "+nome+"\n");  
        
        
        Scanner teclado1 = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        float temp = teclado1.nextFloat();
        float antigo = temp;
        temp = (temp*1.8f)+32;
        System.out.println(antigo+"*C equivale a: "+temp+"*F\n");
        Scanner teclado2 = new Scanner(System.in);
        
        
        System.out.print("Entre com o número: ");
        int num = teclado2.nextInt();
        if (num%2 == 0){
            System.out.println("É par\n");
        }
        else{
            System.out.println("É ímpar\n");
        }
        
        
        
        Scanner teclado3 = new Scanner(System.in);
        System.out.print("Entre com uma quantidade de dinheiro: ");
        float real = teclado3.nextFloat();
        
        int centavos = Math.round(real * 100); //Método que trunca o número, retorna int de 32 bit
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
        int um = centavos;
        
        System.out.println("Moedas de um: "+Um);
        System.out.println("Moedas de 50: "+Cin);
        System.out.println("Moedas de 25: "+Vin);
        System.out.println("Moedas de 10: "+Dez);
        System.out.println("Moedas de 5: "+Co);
        System.out.println("Moedas de 1: "+um+"\n");
    }
}
