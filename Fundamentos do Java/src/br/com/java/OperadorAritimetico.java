package br.com.java;

import java.util.Scanner;

public class OperadorAritimetico {

	public static void main(String[] args) {
		float x, y;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Operacao Aritimetica");
		x = teclado.nextFloat();
		System.out.print("Digite o valor de y: ");
		y = teclado.nextFloat();
		// Soma
		System.out.println("x + y = " + (x + y));
		// Subtracao
		System.out.println("x - y = " + (x - y));
		// Divisão
		System.out.println("x / y = " + (x / y));
		// Multiplicação
		System.out.println("x * y = " + (x * y));
		// Modulo
		System.out.println("x % y = " + (x % y));
		// Incremento x++ (equivale a x = x +1)
		x++;
		System.out.println("x++ " + x);
		// Decremento x-- (equivale a x = x - 1)
		y--;
		System.out.println("y-- " + y);
		
		
		
	}

}
