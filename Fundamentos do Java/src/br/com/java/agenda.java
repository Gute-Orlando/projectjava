package br.com.java;

public class agenda {

	public static void main(String[] args) {
		// Agenda
		String[][] agenda = { { "Bill Gates", "1111-1111", "bill@outlook.com" },
				{ "Linus Torvalds", "2222-2222", "Linus@gmail.com" },
				{ "Steve Jobs", "3333-3333", "steve@icloud.com" } };
		// Recupera
		System.out.println("Email: " + agenda[1][2]);
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("___________________________");
			for (int j = 0; j < agenda[i].length; j++) {
				System.out.println(agenda[i][j]);

			}
		}

	}
}
