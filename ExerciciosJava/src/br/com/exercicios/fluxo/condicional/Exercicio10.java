package br.com.exercicios.fluxo.condicional;

import java.util.Scanner;

public class Exercicio10{
	
	
	public static void main(String[] args) {
		int ladoA, ladoB, ladoC;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa que identifica um tri�ngulo");
		
		System.out.println("Digite a medida do primeiro lado: ");
		ladoA = sc.nextInt();	
		
		System.out.println("Digite a medida do segundo lado: ");
		ladoB = sc.nextInt();
		
		System.out.println("Digite a medida do terceiro lado: ");
		ladoC = sc.nextInt();		
		
		if(ladoA == ladoB && ladoA == ladoC) {
			System.out.println("Equil�tero!!!");
		} else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
			System.out.println("Is�sceles!!!");
		}else if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
			System.out.println("Escaleno!!!");
		}
		sc.close();	
	}

}
