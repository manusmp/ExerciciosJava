package br.com.exercicios.extra;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int a, b, c, brancos, nulos, total = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos votos o candidato A recebeu?");
		a = sc.nextInt();

		System.out.println("Quantos votos o candidato B recebeu?");
		b = sc.nextInt();

		System.out.println("Quantos votos o candidato C recebeu?");
		c = sc.nextInt();

		System.out.println("Quantos votos foram brancos?");
		brancos = sc.nextInt();

		System.out.println("Quantos votos foram nulos?");
		nulos = sc.nextInt();

		total = a + b + c + brancos + nulos;

		System.out.println("O número total de eleitores foi: " + total);
		System.out.println("O percentual de votos do candidato A foi: " + (a * 100) / total);
		System.out.println("O percentual de votos do candidato B foi: " + (b * 100) / total);
		System.out.println("O percentual de votos do candidato C foi: " + (c * 100) / total);
		System.out.println("O percentual de votos brancos foi: " + (brancos * 100) / total);
		System.out.println("O percentual de votos nulos foi: " + (nulos * 100) / total);
		
		sc.close();
	}

}
