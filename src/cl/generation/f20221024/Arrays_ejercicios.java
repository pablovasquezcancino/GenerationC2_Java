package cl.generation.f20221024;

public class Arrays_ejercicios {

	public static void main(String[] args) {
		// Escribir un arreglo de tamaño de 10 ,con números positivos y negativos , capturar en máximo y mínimo


		int [] primerArreglo = new int [10];
		primerArreglo[0] = 12;
		primerArreglo[1] = -3;
		primerArreglo[2] = -23;
		primerArreglo[3] = 38;
		primerArreglo[4] = 99;
		primerArreglo[5] = 15;
		primerArreglo[6] = -10;
		primerArreglo[7] = -11;
		primerArreglo[8] = 66;
		primerArreglo[9] = 5;
		
		
		
		
		int maxNum = primerArreglo[0];
		
		for (int i : primerArreglo) {
			if (i > maxNum)
				maxNum = i;
		}
		
		System.out.println("Maximum number = " + maxNum);
		
		int minNum = primerArreglo[0];
		
		for (int i: primerArreglo) {
			if (i < minNum)
				minNum = i;
		}
		
		System.out.println("Numero Menos = " + minNum);
		
	}

}
