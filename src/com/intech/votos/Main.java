package com.intech.votos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero de eleitores:  ");
        int eleitores = sc.nextInt();

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;

        for (int cont = 1; cont<=eleitores; cont++) {
            System.out.println("Digite o seu voto: ");
            int voto = sc.nextInt();
            if (voto == 1) {
                candidato1++;
            } else if (voto == 2) {
                candidato2++;
            } else if (voto == 3) {
                candidato3++;
            } else {
                System.out.println("Candidato inválido. Tente novamente");
                cont--;
            }
        }

        System.out.println("O candidato 1 recebeu: " + candidato1 + " votos");
        System.out.println("O candidato 2 recebeu: " + candidato2 + " votos");
        System.out.println("O candidato 3 recebeu: " + candidato3 + " votos");
    }
}
