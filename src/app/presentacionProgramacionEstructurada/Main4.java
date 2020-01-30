package app.presentacionProgramacionEstructurada;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de números a ordenar");
		int a = s1.nextInt();
		int[] numeros = new int[a];
		int num = 0;
		int contadorM = 0;
		int contadorm = 0;
		int Mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = s1.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			num = numeros[i];
			if (num > Mayor)
				Mayor = num;
			if (num < menor)
				menor = num;

		}

		for (int j = 0; j < numeros.length; j++) {
			num = numeros[j];
			if (num == Mayor)
				contadorM++;

			if (num == menor)
				contadorm++;

		}

		System.out.println("La cantidad de elementos es de  :" + Arrays.toString(numeros));
		System.out.println("Salen: ");
		System.out.println("El nº Mayor es " + Mayor + " y se repite un total de " + contadorM + "veces");
		System.out.println("El nº más pequeño es " + menor + " y se repite un total de " + contadorm + "veces");
	}

}
