package ar.edu.unq.po2.tp3.Multioperador;

import java.util.ArrayList;

public class Multioperador {

		private ArrayList <Integer> numeros;
		
		public Multioperador() {
			this.numeros = new ArrayList<>();
		}
		
		//Metodo para agregar numeros 
		public void addNumber(int number) {
			numeros.add(number);
		}
		
		//Metodo para sumar todos los numeros
		public int sumarTodo() {
			
			//Retorna que no hay suficientes numeros para aplicar el operador.
			if (numeros.size() < 2) {
				System.out.println("No hay suficientes numeros para aplicar el operador de suma");
			}
			
			int resultado = 0;
			for (int numero : numeros) {
			resultado = resultado + numero;
			}
			
			return resultado;
		}
		
		//Metodo para restar todos los numeros
		public int restarTodo() {
					
			//Retorna que no hay suficientes numeros para aplicar el operador.
			if (numeros.size() < 2) {
				System.out.println("No hay suficientes numeros para aplicar el operador de resta");
			}
							
			int resultado = numeros.get(0); //Se guarda el primer numero para comenzar desde el segundo.
			for (int i=1; i < numeros.size(); i++) {
				resultado = resultado - numeros.get(i);
			}
					
			return resultado;
	
		}
		
		//Metodo para multiplicar todos los numeros.
		public int multiplicarTodo() {
			
			//Retorna que no hay suficientes numeros para aplicar el operador.
			if (numeros.size() < 2) {
				System.out.println("No hay suficientes numeros para aplicar el operador de multiplicacion");
			}
							
			int resultado = numeros.get(0); //Se guarda el primer numero para comenzar desde el segundo.
			for (int i=1; i < numeros.size(); i++) {
				resultado = resultado * numeros.get(i);
			}
					
			return resultado;
	
		}
		
		
}
