package ar.edu.unq.po2.tp3.counter;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList <Integer> numeros;
	
	public Counter() {
		this.numeros = new ArrayList<>();
	}
	
	// Metodo para agregar un numero a la lista de numeros
	public void addNumber(int numero) {
		numeros.add(numero);
	}
	
	// Metodo para contar los numeros pares
	public int cantidadNumerosPares() {
		int contador = 0;
		for (int numero : numeros) {
			if (esNumeroPar(numero) ) {
				contador++ ;
			}
		}
		
		return contador;
	}
	
	
	// Metodo para contar los numeros impares
	public int cantidadNumerosImpares() {
		int contador = 0;
		for (int numero : numeros) {
			if (esNumeroImpar(numero)) {
				contador++ ;
			}
		}
		
		return contador;
	}
	
	
	// Metodo para contar los numeros que son multiplos de otros
	public int cantidadDeMultiplosDe(int numeroMultiplo) {
		int contador = 0;
		for (int numero : numeros) {
			if (numero % numeroMultiplo == 0) {
				contador++ ;
			}
		}
		
		return contador;
	}
	
	// Metodo para saber si un numero es par.
	public boolean esNumeroPar(int numero) {
		return numero % 2 == 0;
	}
	
	// Metodo para saber si un numero es impar.
		public boolean esNumeroImpar(int numero) {
			return numero % 2 == 1;
		}
		
		
}