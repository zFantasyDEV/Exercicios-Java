package exercicios.mutiplos;

import java.util.Scanner;

public class Mutiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("S�o m�tiplos");
		} else {
			System.out.println("N�o s�o m�tiplos");
		}
		
		sc.close();
	}

}
