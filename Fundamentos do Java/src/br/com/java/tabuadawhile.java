package br.com.java;

import java.util.Scanner;

public class tabuadawhile {

	public static void main(String[] args) {
		// Tabuada usando While	
		int valor;
		int i =1; // Variavel de apoio ao laço do While
		Scanner teclado = new Scanner(System.in);
		System.out.println("Tabuada While");
		System.out.println("");
		System.out.println("Insira o valor: ");
		System.out.println("");
		valor = teclado.nextInt();
		System.out.println("");
		while (i < 11) {
		System.out.println(valor + " x " + i + " = " + (valor * i));
		i++;	
	}
  }
}
