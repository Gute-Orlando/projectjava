package br.com.java;

import java.util.Scanner;

public class DivisãoTemaLivre {

	public static void main(String[] args) {
		// Calcular Divisões
		double x, y, r;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Divisor");
		System.out.println("");
		//Entrada
		System.out.println("Digite o primeiro numero: ");
		x = teclado.nextDouble();
		System.out.println("Digite o segundo numero: ");
		y = teclado.nextDouble();
		//processamento
		r = (x / y);
		//saida
		System.out.println("Resultado: " + r);
		
				
	}

}
