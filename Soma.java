/* 
 * 
 * Faça um programa que some dois números.
 * 
 */

package exercicios.soma;

import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois valores:");
		
		int a, b, soma;
		
		a = sc.nextInt();
		
		b = sc.nextInt();
		
		soma = a + b; 
		
		// Ou: 
		
		/*int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;*/
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}
}
