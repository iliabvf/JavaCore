package com.iliabvf.javacore.chapter02;

/* Продемонстрировать применение блока кода. Присвоить исходному файлу имя "BlockTest.java" */ 
class BlockTest { 
	public static void main (String args[])   { 
		int x, y; 
		y = 20; 
		// адресатом  этого оператора цикла служит  блок кода 
		for (x = 0; x<10; x++) { 
			System.out.println("Знaчeниe x: "+ x) ; 
			System.out.println("Зн  aчeниe y: "+ y ); 
			y = y -2;
		}
	}
}