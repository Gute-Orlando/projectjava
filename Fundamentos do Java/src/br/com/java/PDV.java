package br.com.java;

import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		double pre�o,desconto,total,recebido,troco;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Desconto do Produto");
		// entrada 
		System.out.print("Pre�o do Produto: ");
		pre�o = teclado.nextDouble();
		System.out.print("Valor do Desconto: ");
		desconto = teclado.nextDouble();		
		//processamento
		troco = (pre�o * desconto) / 100;
		total = (pre�o - troco);
		//saida
		System.out.println("Total com Desconto: " + total);
		System.out.println("Valor Recebido: ");
		recebido = teclado.nextDouble();
		recebido = (recebido - total );
		System.out.println("Valor do Troco= " + recebido);
		
		
	
		
	}

}
