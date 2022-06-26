package br.com.exercicios.lacosderepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int valor, dentro = 0, fora = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite um número");
			valor = sc.nextInt();
			if (valor >= 10 && valor <= 20) {
				dentro++;				
			}else
				fora++;

		}
		System.out.println("Entre 10 e 20: " + dentro);
		System.out.println("Fora do intervalo: " + fora);
		
		sc.close();

	}

}
