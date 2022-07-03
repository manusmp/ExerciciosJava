package br.com.exercicios.vetores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		String[] nome = new String[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um nome: ");
			nome[i] = sc.next();
		}
		System.out.println("Nomes: \n");

		for (int i = 0; i < 5; i++) {
			System.out.println(nome[i]);
		}
		
		System.out.println("\nReverso: ");

		
		for (int i = nome.length - 1; i >= 0; i--) {
            System.out.print("\n" + nome[i]);
        }
		
		

		sc.close();
	}
}
