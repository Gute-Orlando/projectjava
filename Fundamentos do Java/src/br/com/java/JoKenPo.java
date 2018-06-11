package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class JoKenPo {

	public static void main(String[] args) {
		// Jogo JoKenPo
		int jogar;
		Scanner teclado = new Scanner(System.in);
		System.out.println("----------------------------");
		System.out.println("           JoKenPo          ");
		System.out.println("----------------------------");
		System.out.println("");
		System.out.println("Digite 1 para Pedra");
		System.out.println("Digite 2 para Papel");
		System.out.println("Digite 3 para Tesoura");
		System.out.println("Digite a opção desejada: ");
		jogar = teclado.nextInt();
		//Processamento
		switch (jogar) {
			case 1: 
				System.out.println("Voce escolheu Pedra");
				break;
			case 2:
				System.out.println("Voce escolheu Papel");
				break;
			case 3:
				System.out.println("Voce escolheu Tesoura");
				System.out.println("");
				break;
				default:
					System.out.println("Opção Invalidá: ");
					break;
				
				
		}
		
		//Computador
		
		Random computador = new Random();
		int opcao = computador.nextInt(3) + 1;
		switch (opcao) {
		case 1: 
			System.out.println(" O computador escolheu Pedra");
			break;
		case 2:
			System.out.println("O computador escolheu Papel");
			break;
		case 3:
			System.out.println("O computador escolheu Tesoura");
			break;
		
		}
		//Processamento
		if ((jogar == 1 && opcao ==3) || (jogar ==2 && opcao ==1 ) || (jogar ==3 && opcao ==2)) {
			System.out.println("Voce VENCEU!!");
		} else if ((jogar == 1 && opcao ==2) || (jogar ==2 && opcao ==3 ) || (jogar ==3 && opcao ==1)) {
			System.out.println("Computador VENCEU!!");
		} else {
			System.out.println("Empate!!");
		}
		
		
		
		
		
				
			
		
		

		
	
		
	
				
				
					
						
					
				
				
			

	
	}
	
}

