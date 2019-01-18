/*
 * 
 * Faça um programa que calcule: 
 * 
 * Área do circulo, triangulo, retangulo, quadrado e trapezio.
 * 
 */

package exercicios.calculoes;

import java.util.Locale;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, resT, resC, resTra, resQ, resR, pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		resT = A * C / 2.0;
		resC = pi * C * C;
		resTra = (A+B) / 2 * C;
		resQ = B * B;
		resR = A * B;
		

		System.out.printf("TRIANGULO: %.3f%n", resT);
		System.out.printf("CIRCULO: %.3f%n", resC);
		System.out.printf("TRAPEZIO: %.3f%n", resTra);
		System.out.printf("QUADRADO: %.3f%n", resQ);
		System.out.printf("RETANGULO: %.3f%n", resR);
		
		sc.close();
	}

}
