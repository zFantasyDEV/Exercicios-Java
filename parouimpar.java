/*
 * Faça o programa que indique se o número é par ou impar.
 * 
 */

package exercicios.parouimpar;

import java.util.Scanner;

public class parouimpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}

}
