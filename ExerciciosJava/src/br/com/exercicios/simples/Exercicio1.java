package br.com.exercicios.simples;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        double C, K, F, Re, Ra;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Conversor de temperaturas");

        
        System.out.println("Digite a temperatura em Celsius: ");
        C = sc.nextDouble();
        
       
        F = C * 1.8 + 32;
        K = C + 273.15;
        Ra = C * 1.8 + 32 + 459.67;
        Re = C * 0.8;

        System.out.println("Kelvin: " + K);
        System.out.println("Reaumur: " + Ra);
        System.out.println("Rankine: " + Re);
        System.out.println("Fahrenheit: " + F);
        
        sc.close();	
    }
}
