package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Mavenproject1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        float[] v = new float[n];
        for (int i=0; i<n; i++){
            System.out.println("Entre com a nota do aluno "+(i+1)+":");
            float nota = teclado.nextFloat();
            v[i] = nota;
        }
        System.out.println("Entre com k: ");
        float k = teclado.nextFloat();
        int apareceu = 0;
        for (int j = 0; j<n; j++){
            if (v[j] == k){
                System.out.println("Aparece na posição: "+(j+1));
                apareceu += 1;
            }
        }
        if (apareceu == 0){
            System.out.println("Posição inválida");
        }
    }
}

