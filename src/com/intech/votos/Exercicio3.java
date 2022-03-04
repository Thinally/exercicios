package com.intech.votos;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("O numero é par");
        }else {
            System.out.println("Numero é impar");
        }

    }
}
