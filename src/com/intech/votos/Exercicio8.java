package com.intech.votos;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Terceiro numero: ");
        int num3 = sc.nextInt();

        if(num1 < num2){
            if(num2 < num3){
                System.out.println(num1);
            }
        }
    }
}
