package br.com.java;

import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		double preço,desconto,total,recebido,troco;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Desconto do Produto");
		// entrada 
		System.out.print("Preço do Produto: ");
		preço = teclado.nextDouble();
		System.out.print("Valor do Desconto: ");
		desconto = teclado.nextDouble();		
		//processamento
		troco = (preço * desconto) / 100;
		total = (preço - troco);
		//saida
		System.out.println("Total com Desconto: " + total);
		System.out.println("Valor Recebido: ");
		recebido = teclado.nextDouble();
		recebido = (recebido - total );
		System.out.println("Valor do Troco= " + recebido);
		
		
	
		
	}

}
