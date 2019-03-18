package com.iliabvf.javacore.chapter03;

// Продемонстрировать область действия блока кода 
class Scope { 
	public static void main (String args[]) { 
		int x; // эта переменная доступна всему коду  из метода lll&in() 
		x = 10; 
		if(x == 10) { // начало новой области действия,  
			int y = 20;  // доступной только этому блоку  кода 
			// обе переменные x и y доступны в  этой  области действия 
			System.out.println("x  и y: " + x  + " " + y); 
			x = y * 2; 
		}
		// y = 100;
		System.out.println("x  равно "  + x) ; 
	}
}