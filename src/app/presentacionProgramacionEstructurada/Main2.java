package app.presentacionProgramacionEstructurada;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		int numero;

		for (int i = 0; i <= 10; i++) {
			System.out.println(" Introducir numero ");
			numero = s1.nextInt();

			if (numero < 0) { // numero / 2 = resto dice si el resto es par

				System.out.println("el numero es negativo " + numero);

			} else {
				if (numero == 0) {
					System.out.println("el numero es igual a 0 ");
				} else {
					System.out.println("el numero es positivo");
				}

			}
		}
	}

}
