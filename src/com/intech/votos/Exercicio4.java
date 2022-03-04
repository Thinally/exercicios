package com.intech.votos;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        System.out.println("Digite um numero A: ");
        a = sc.nextInt();
        System.out.println("Digite um numero B: ");
        b = sc.nextInt();

        if(a == b) {
            int c = a + b;
            System.out.println("C: " + c);
        }else {
            int c = a * b;
            System.out.println("C: " + c);
        }
    }
}
