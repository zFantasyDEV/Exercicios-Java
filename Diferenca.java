/*
 * 
 * Fa�a um programa que calcule a diferen�a
 * 
 */

package exercicios.diferenca;

import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A, B, C, D, DIFERENCA;

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		DIFERENCA = (A * B - C * D);

		System.out.println("Diferen�a = " + DIFERENCA);

		sc.close();
	}

}
