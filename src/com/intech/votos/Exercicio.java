package com.intech.votos;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int total = 0;

        System.out.println("Qual é o valor de A? ");
        a = sc.nextInt();
        System.out.println("Qual é o valor de B? ");
        b = sc.nextInt();
        System.out.println("Qual é o valor de C? ");
        c = sc.nextInt();
        total = a + b;

        if(total < c){
            System.out.println("A soma de a + b é menor que o valor de c.");
        }
    }
}
