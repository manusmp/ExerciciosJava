package br.com.exercicios.simples;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
        double m, h, t, cavalos;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a massa em quilogramas: ");
        m = sc.nextDouble();
        
        System.out.println("Digite a altura em metros: ");
        h = sc.nextDouble();
        
        System.out.println("Digite os segundos: ");
        t = sc.nextDouble();
        
        
        cavalos = (m * h / t) / 745.6999;

        System.out.printf("A quantidade de cavalos necessários é %.2f", cavalos);
        sc.close();
    }
}


