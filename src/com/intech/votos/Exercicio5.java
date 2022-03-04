package com.intech.votos;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int num2 = 0;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        if (num > 0) {
            System.out.println(num * 2);
        }
            if (num < 0){
                System.out.println(num * 3);
            }
    }
}

