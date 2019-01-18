/*
 * 
 * Faça um programa que indique se o número é: 
 * 
 * POSITIVO
 * NÃO NEGATIVO
 * NEGATIVO
 * 
 */

package exercicios.negativo;

import java.util.Scanner;

public class NegPosNaoPos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		
		if (n1 < 0) {
			System.out.println("NEGATIVO");
		} else if (n1 == 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("POSITIVO");
		}
		
		sc.close();
	}

}
