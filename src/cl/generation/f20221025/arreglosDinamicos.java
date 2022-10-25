package cl.generation.f20221025;

import java.util.ArrayList;

public class arreglosDinamicos {

	public static void main(String[] args) {
		// ArrayList
		// 1.- Definición:
		// ArrayList <tipodato> nombre de array = new ArrayList <Tipo de dato> ();
		ArrayList<String> takeFive = new ArrayList<String>();
		// 2. Agregar valores al arreglo:
		takeFive.add("Luis");
		takeFive.add("Kiara");
		takeFive.add("Daniel");
		takeFive.add("Cynthia");
		takeFive.add("Pavlo");

		System.out.println(takeFive);

		// 3.- Tamaño de arreglo:
		takeFive.size();
		System.out.println(takeFive.size());

		// 4.- Obtener un elemento adentro del arreglo
		takeFive.get(4);
		System.out.println(takeFive.get(4));

		// 5.- Eliminar un elemento del array
		takeFive.remove(4);
		System.out.println(takeFive);

		takeFive.add("Pavlo");

		// 6.- Recorrer el ArrayList:

		for (int i = 0; i < takeFive.size(); i++) {
			System.out.println(takeFive.get(i));
		}

		System.out.println("*******************");
		// FOR ITERADOR O FOR OBJETO:

		for (String miembro : takeFive) {
			System.out.println("miembro del grupo más pulenta: " + miembro);

		}

	}

}
