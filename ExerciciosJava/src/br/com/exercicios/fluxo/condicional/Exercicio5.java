package br.com.exercicios.fluxo.condicional;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
        int n1, n2, n3;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		n2 = sc.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		n3 = sc.nextInt();
		
		if(n1 < n2 && n2 < n3){
			System.out.println("Ordem: " + n1 + "," + n2 + "," + n3);

		}else if(n1 < n3 && n3 < n2) {
			System.out.println("Ordem: " + n1 + "," + n3 + "," + n2);

		}else if (n2 < n1 && n1 < n3) {
			System.out.println("Ordem: " + n2 + "," + n1 + "," + n3);
			
		}else if(n2 < n3 && n3 < n1) {
			System.out.println("Ordem: " + n2 + "," + n3 + "," + n1);

		}else if(n3 < n1 && n1 < n2) {
			System.out.println("Ordem: " + n3 + "," + n1 + "," + n2);

		}
		else {
			System.out.println("Ordem: " + n3 + "," + n2 + "," + n1);
		}
			
		sc.close();
		}
	
		
	

}

