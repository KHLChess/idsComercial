package MiScore;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x;
		CreaScore cs = new CreaScore();
		Scanner tecla = new Scanner(System.in);
		do {
			System.out.println("Bienvenido al programa para calcular el score");
			System.out.println("Indique el numero para comenzar a sumar: ");
			x = tecla.nextInt();
			cs.setValores(x);
			System.out.println("Score: " + cs.setContador());
		}while(x != 0);
		System.out.println("Fin del programa");
	}
}
