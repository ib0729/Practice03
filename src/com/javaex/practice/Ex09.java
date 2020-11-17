package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		
		for(int x= 1; x<=10; x++) {
			for(int y=x; y<=x+9; y++) {
				System.out.print(String.format("%2d", y));
				System.out.print("   ");
			}
			System.out.println();
		}
	}

}
