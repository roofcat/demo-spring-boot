package com.crojas.demo.init;

public class Prueba {

	public static void main(String[] args) {
		
		DemoTest dt = () -> {
			for ( int i = 0; i <= 10; i++ ) {
				
				System.out.println("hola " + i);
				
			}
		};
		
		dt.correr();
		
	}
	
}
