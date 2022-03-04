package com.intech.votos;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int par = 0;

        num = sc.nextInt();
        if(num % 2 == 0) {
            par  = num + 5;
        }else {
            par = num + 8;
        }
        System.out.println(par);
    }
}
