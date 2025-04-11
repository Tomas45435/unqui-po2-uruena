package ar.edu.unq.po2.tp3.NumberAnalyzer;


public class NumberAnalyzer {
	
	/**
     * Encuentra el número con la mayor cantidad de dígitos pares en un arreglo de numeros enteros.
     * @return El número con más dígitos pares. Si hay empate, devuelve el primero encontrado.
     *         Si el arreglo está vacío, devuelve 0.
     */
	
public int encontrarNumeroConMasDigitosPares(int[] arregloNumeros) {
		
		// Verifico si el arreglo esta vacio.
		if (arregloNumeros == null || arregloNumeros.length == 0) {
			return 0;
		}
		
		//Se inicializa el bucle
		int numeroConMasPares = arregloNumeros[0];
		int maxPares = contarDigitosPares(arregloNumeros[0]);
		
		for (int i=1; i < arregloNumeros.length; i++) {
			int paresActual = contarDigitosPares(arregloNumeros[i]);
			if (paresActual > maxPares) {
				maxPares = paresActual;
				numeroConMasPares = arregloNumeros[i];
			}
		}
		
		return numeroConMasPares;
	}
	
	
	/*
     * Cuenta la cantidad de dígitos pares en un número
     * @return Cantidad de dígitos pares
    */

	public int contarDigitosPares(int numero) {
		
		// Si el numero es 0, se retorna 1 ya que 0 se considera par
		if (numero == 0) {
			return 1;
		}
		
		int contador = 0;
		// Se obtiene el valor absoluto de numero, en caso de ser negativo.
		int num = Math.abs(numero);
		
		while (num > 0) {
			int digito = num % 10;
			if (digito % 2 == 0) {
				contador++;
			}
			num = num / 10;
		}
		
		return contador;
		
	}
}

