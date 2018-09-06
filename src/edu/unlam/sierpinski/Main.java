package edu.unlam.sierpinski;

public class Main {

	public static void main(String[] args) {
		
	//89 es el 45° nro impar natural
	for(int i=1; i<=89 ; i+=2)
		System.out.println("El nro: " + i + " es: " + Sierpinski.esSierpinski(i));
				

	}

}
