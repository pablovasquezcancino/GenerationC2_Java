package cl.generation.f20221025;

import java.util.HashSet;

public class ArregloHashSet {

	public static void main(String[] args) {
		// Set o HashSet
		// 1.- Definición HashSet: (No permite datos duplicados y entrega un orden aleatorio)
		HashSet <String> takeFive = new HashSet <String>();
		
		// 2.- Agregar elementos al array
		takeFive.add("Cynthia");
		takeFive.add("Daniel");
		takeFive.add("Kiara");
		takeFive.add("Luis");
		takeFive.add("Pavlo");
		
		// 3.- Verificdar el contenido del array:
		boolean nameVerification = takeFive.contains("Pavlo");
		System.out.println(nameVerification);
		
		boolean nameVerification2 = takeFive.contains("Hola");
		System.out.println(nameVerification2);
		
		//4.- eliminar el elemento por el contenido
		
		takeFive.remove("Luis");
		System.out.println(takeFive);
		
		// 5. Tamaño del arreglo
		System.out.println(takeFive.size());
		
		// Recorrer el arreglo con For de objeto:
		
		for (String integrante : takeFive) {
			System.out.println(integrante);
		}
		
		
	}

}
