package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class jogodado {

	public static void main(String[] args) {
		//Jogo de Dado
		char opçao;
		Scanner teclado = new Scanner(System.in);
		char opcao;
		do {
			//a linha abaixo usa a classe Random para criar um objeto que será usado para gerar némeros
			Random dado = new Random();
			int face = dado.nextInt(6) + 1; //gerar numeros aleatorios (0 a 5) somamos 1 ao resultado pois não existe a face 0 no dado
			System.out.println("Face do dado: " + face);
			System.out.println("Deseja jogar novamente(s/n)?  ");
			System.out.println("");
			//charAT(0) captura apenas a letra que foi digitada
			opcao = teclado.next().charAt(0);
			}while (opcao == 's');

 }

}
