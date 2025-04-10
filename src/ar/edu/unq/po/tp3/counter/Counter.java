package ar.edu.unq.po.tp3.counter;

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
			if (numero % 2 == 0) {
				contador++ ;
			}
		}
		
		return contador;
	}
	
	
	// Metodo para contar los numeros impares
	public int cantidadNumerosImpares() {
		int contador = 0;
		for (int numero : numeros) {
			if (numero % 2 == 1) {
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
	
}