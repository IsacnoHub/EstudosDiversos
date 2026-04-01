package com.mycompany.mavenproject1;
public class Mavenproject1 {

    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            System.out.printf("\n");
            for (int j=0; j<10; j++){
                System.out.printf("%dx%d = %d\t", j+1, i+1, ((i+1)*(j+1)));
                //O \t é um tab, aí fica bonitinho
            }
        }
    }
}

