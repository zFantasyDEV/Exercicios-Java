/*
 * 
 * Faça um programa que indique qual é o maior número entre três números.
 * 
 */

package exercicios.condicionais;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.println("Maior = " + a);
		} else if (b > c) {
			System.out.println("Maior = " + b);
		} else {
			System.out.println("Maior = " + c);
		}
		
		sc.close();
	}

}
