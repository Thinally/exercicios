package com.intech.votos;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        float n1 = 0;
        float n2 = 0;
        float n3 = 0;
        float n4 = 0;
        float total = 0;
        float media = 0;

        System.out.println("Qual é seu nome? ");
        nome = sc.nextLine();


        total = n1+n2+n3+n4;
        media = total / 4;

        System.out.println(nome + " sua media é: " + media);

        if(media >= 6) {
            System.out.println("Parabens");
        } else {
            System.out.println("Reprovado");
        }

    }
}
