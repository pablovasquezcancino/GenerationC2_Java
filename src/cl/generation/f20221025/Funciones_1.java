package cl.generation.f20221025;

import java.util.Arrays;

public class Funciones_1 {

	public static void main(String[] args) {
		// FUNCIONES O METODO:
		nombreMetodo();
		segundoMetodo("Andréi");
		tercerMetodo(31, 23.5f);
		String [] saludos = {"hola", "chao", "ciao"};
		cuartoMetodo(saludos);
		// METODOS CON LLAMADO:
		System.out.println(retornoUno());
		
		String nombreApellidos = obtenerNombre("Pablo", "Vásquez", "Cancino");
		System.out.println("El nombre completo es: " + nombreApellidos);
		
	}
	
	public static void nombreMetodo() {
		System.out.println("Estoy dentro del metodo inicial, AGGUANTE BOCA PAPA DE DIOS.");
		 
	
	}
	
	public static void segundoMetodo(String nombre) {
		System.out.println("Hola soy: " + nombre);
	}
	
	public static void tercerMetodo(Integer numero1, Float numero2) {
		System.out.println(numero1 + numero2);
	}
	
	public static void cuartoMetodo(String [] arreglito) {
		System.out.println("soy el arreglito " + Arrays.toString(arreglito));
	}
	
	//FUNCIONES CON RETORNO:
	
	public static Integer retornoUno() {
		Integer totalAlumnos = 35;
		return totalAlumnos;
	}
	
	
	/* @param nombre
	 * @param apellidoUno
	 * @param apellidoDo
	 * @ return nombreCompleto
	 * 
	 * 
	 * */
	public static String obtenerNombre(String nombre, String apellidoUno, String apellidoDos) {
		String nombreCompleto = nombre+" "+apellidoUno+" "+apellidoDos;
		return nombreCompleto;
	}
}
