package edu.unlam.sierpinski;

public class Sierpinski {
	
	public static boolean esSierpinski(int k) {
		//verifico que sea impar
		if(k%2==0 || k>89 || k < 1)
			return false;
		
		int n = 1;
		while(n<1002 && !esPrimo((k*Math.pow(2, n)+1)))
			n++;
		
		return n==1002;
	}
	
	public static boolean esPrimo(double n) {
		//El metodo matematico para analizar si un nro es primo dice que hay que calcularle la raiz cuadrada al nro
		//Y, quedandose con la parte entera, dividir por todos los nros primos que estén entre el 2 y el valor obtenido da la raíz
		//Si en esa búsqueda se encuentra algún divisor entonces no es primo (es compuesto)
		double tope = Math.sqrt(n), i = 2;
		
		if(n%i!=0) {	//primero pruebo para el '2' y, a partir del '3', incremento de 2 en 2 (los nros pares no son primos)
			i++;
			while(i <= tope && n % i != 0)
				i+=2;
		}
		
		return i > tope;	//Si i superó al tope entonces es primo, caso contrario es compuesto.
	}

}


