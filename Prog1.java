/*
 * Faça um programa que leia os seguintes itens:
 * 
 * Digite seu nome completo:
 * 
 * Quantos banheiros tem na sua casa?
 * 
 * Digite o preço do produto:
 * 
 * Digite seu último nome, idade e altura (na mesma linha):
 * 
 */

package exercicios.dados.curso;

import java.util.Locale;
import java.util.Scanner;

public class Prog1 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo:");
		String name = sc.nextLine();
		
		System.out.println("Quantos banheiros tem na sua casa?");
		int br = sc.nextInt();
		
		System.out.println("Digite o preço do produto:");
		double price = sc.nextDouble();
		
		System.out.println("Digite seu último nome, idade e altura (na mesma linha):");
		String lastName = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(br);
		System.out.println(price);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(height);
		
		sc.close();
	}
}
