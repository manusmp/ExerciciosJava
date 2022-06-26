package br.com.exercicios.fluxo.condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		String senha;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		senha = sc.next();
		
		if(senha.equals("1234")) {			
			System.out.println("ACESSO PERMITIDO");
		}else {
			System.err.println("ACESSO NEGADO");
		}		
		
		sc.close();
	}
	
}
