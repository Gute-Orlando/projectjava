package br.com.java;

import java.util.Random;

public class jogodecartas {

	public static void main(String[] args) {
		
		Random cartas = new Random();
		String[] nipes= { "♥", "♦", "♣", "♠" };
		String[] faces= { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		
		// System.out.println(faces[11] + nipes[0]);
		
		int face = cartas.nextInt(faces.length);
		int nipe = cartas.nextInt(4);
		System.out.println(faces[face] + nipes[nipe]);
		
		
		
		

	}

}
