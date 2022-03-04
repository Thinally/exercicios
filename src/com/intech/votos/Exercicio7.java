package com.intech.votos;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int par = 0;

        numero = sc.nextInt();
        if(numero % 2 == 0) {
            par  = numero + 5;
        }else {
            par = numero + 8;
        }
        System.out.println(par);
    }
}
