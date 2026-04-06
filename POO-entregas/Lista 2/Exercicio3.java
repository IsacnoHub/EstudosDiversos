package com.mycompany.mavenproject1;
import java.lang.Math;
import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o tempo: ");
        float x = teclado.nextFloat();
        float seg = x % 60;
        x -= seg;
        int hora = (int)x/3600;
        x -= hora*3600;
        int min = (int)x/60;
        System.out.println("Horas: "+hora);
        System.out.println("Minutos: "+min);
        System.out.println("Segundos: "+seg);
    }
}

