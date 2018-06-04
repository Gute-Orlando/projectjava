package br.com.java;

import java.util.Scanner;

public class DollarReal {

	public static void main(String[] args) {
		// Conversao
		double dollar, real,conversao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Conversão de Dollar para Real");
		System.out.println();
		//Inicio
		System.out.print("Digite o Valor em Dolar: ");
		dollar = teclado.nextDouble();
		real = (3.76);
		//Processo
		conversao = dollar * real;
		//Fim
		System.out.println(conversao + "R$");
	
	}

}
