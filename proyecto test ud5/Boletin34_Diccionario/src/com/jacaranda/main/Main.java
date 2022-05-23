package com.jacaranda.main;
import com.jacaranda.lemas.*;
import java.util.Scanner;

public class Main {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// Creo diccionario
		Diccionario d1 = new Diccionario();
		char opcion;
		do {
			//Menú
			System.out.println("Introduce el número de la opción deseada; 1.Añadir palabra\n2.Buscar palabra\n3.Borrar palabra\n"
					+ "4.Listar palabras que empiecen por...\n 5.Salir");
			opcion = teclado.nextLine().charAt(0);
			
			switch(opcion) {
				case(1):{
					System.out.println("Introduce la palabra: ");
					String palabraA = teclado.nextLine();
					System.out.println("Introduce el significado: ");
					String significado = teclado.nextLine();
					d1.addPalabra(palabraA, significado);
				}
				case(2):{
					System.out.println("Introduce la palabra: ");
					String palabraB = teclado.nextLine();
					d1.buscarPalabra(palabraB);
				}
				case(3):{
					System.out.println("Introduce la palabra: ");
					String palabraBorrar = teclado.nextLine();
					d1.buscarPalabra(palabraBorrar);
				}
				case(4):{
					System.out.println("Introduce la cadena: ");
					String cadena = teclado.nextLine();
					d1.listadoPalabrasQueEmpiezanPor(cadena);
				}
			}
		}while (opcion!=5);

	}

}
