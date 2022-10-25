package cl.generation.f20221024;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arreglo en Java
		int[] arreglo = new int[3];
		// arreglo.length: tamaño del arreglo
		
		// Agregar Datos:
			arreglo[0] = 4;
			arreglo[1] = 8;
			arreglo[2] = 45;
			System.out.println(arreglo.toString());
			System.out.println(Arrays.toString(arreglo));
			
			
			int [] sinNumero = {}; // Para asignarle valores por default nosotros asignamos las llaves{}
			System.out.println(sinNumero.length);
			
			String [] vocales =  {"a", "e", "i", "o", "u"};
			System.out.println("Cantidad de elementos del arreglo: " + vocales.length);
			vocales[0] = "j";
			System.out.println(vocales[0]);
			//sinNumero[0] = 2; // NO ESTA PERMITIDO PARA UN ARREGLO VACÍO, NO SE PUEDE.
			//System.out.println(sinNumero[0]);
			System.out.println(Arrays.toString(vocales));
			
			//EJERCICIO: Crear un array de numero flotante de tamaño 6:
			
			float [] arregloFlotante = new float [6];
			
			// Agregar 6 elementos al arreglo:
			
			arregloFlotante[0] = 1.5f;
			arregloFlotante[1] = 3.3f;
			arregloFlotante[2] = 5.1f;
			arregloFlotante[3] = -0.6f;
			System.out.println(Arrays.toString(arregloFlotante));
			
			// Crear un arreglo de enteros tamaño 100 y agregar valores dinamicamente desde el 1 al 100
			
			int [] arregloEntero = new int [100];
			
			for(int i = 1; i <= 100; i++) {
				arregloEntero[i-1] = i;
			
			}
			
			System.out.println(Arrays.toString(arregloEntero));
			
			int [] arregloEntero2 = new int [100];

			for(int i = arregloEntero2.length; i > 0; i--) {
				arregloEntero2[arregloEntero2.length - i] = i;

			}

			System.out.println(Arrays.toString(arregloEntero2));

			}
		
			
					
			}

			
	

	
			
	




