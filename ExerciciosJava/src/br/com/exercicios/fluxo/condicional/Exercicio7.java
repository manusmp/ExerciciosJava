package br.com.exercicios.fluxo.condicional;

import java.util.Scanner;

public class Exercicio7 {
	
	
	public static void main(String[] args) {
		Double qtd, medida, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa que calcula e identifica um polígono regular");
		
		System.out.println("Digite a quantidade de lados: ");
		qtd = sc.nextDouble();		
		
		System.out.println("Digite a medida do lado em cm: ");
		medida = sc.nextDouble();		
		
		if(qtd == 3) {
			area = medida * qtd;
			System.out.println("Triangulo com area  " + area);
		} else if(qtd == 4) {
			area = medida * qtd;
			System.out.println("Quadrado com area " + area);
		}else if(qtd == 5) {
			area = medida * qtd;
			System.out.println("Pentágono com area  " + area);
		}
		sc.close();	
	}

}
