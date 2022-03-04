package com.intech.votos;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome = "";
        String sexo = "";
        String civil = "";

        System.out.println("Qual seu nome?");
        nome = sc.nextLine();
        System.out.println("Qual seu sexo?");
        sexo = sc.nextLine();
        System.out.println("Qual seu estado civil?");
        civil = sc.nextLine();

        if(sexo == "f" && civil == "casado"){
            System.out.println("Quantos anos de casado?");
        }
    }
}
