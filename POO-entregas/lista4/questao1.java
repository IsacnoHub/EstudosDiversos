package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Mavenproject1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nAlunos = teclado.nextInt();
        float[] notas = new float[nAlunos];
        float soma = 0;
        for (int i=0; i<nAlunos; i++){
            System.out.println("Entre com a nota do aluno "+(i+1)+":");
            float nota = teclado.nextFloat();
            notas[i] = nota;
            soma += nota;
        }   
        float media = soma/nAlunos;
        System.out.println("Média: "+media);
        for (int j=0; j<nAlunos; j++){
            if (notas[j] >= media)
                System.out.println("Aluno: "+(j+1)+" PARABÉNS!!");
        }
    }
}

