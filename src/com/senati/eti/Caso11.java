package com.senati.eti;

import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("\n======== Resultados ========");
		System.out.println("N�mero de caracteres: " + nombre.length());
	}

}
