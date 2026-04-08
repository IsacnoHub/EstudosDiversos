package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Mavenproject1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com n: ");
        int n = teclado.nextInt();
        int[] v = new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Entre com o número: "+(i+1)+" :");
            int num = teclado.nextInt();
            v[i] = num;
        }
        System.out.println("Entre com k: ");
        int k = teclado.nextInt();
        System.out.println("Entre com p: ");
        int p = teclado.nextInt();
        if (p > n)
            System.out.println("P inválido");
        else{
            int passos = n - p;
            for (int j=p+1; j<passos; j++){
                v[j+1] = v[j];
            }
            v[p] = k;
            System.out.println("{");
            for (int l=0; l<n; l++)
                System.out.printf("%d ", v[l]);
            System.out.printf("}");
        }
    }
}

