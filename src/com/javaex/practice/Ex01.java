package com.javaex.practice;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		
		System.out.println("while문");
		int index = 0;
		while( index < 3) {
			System.out.println("index=" + index);
			index++;
		}
		
		System.out.println("for문");
		for(int order=0; order<3; order++) {
			System.out.println("order=" + order);
		}
		
		sc.close();
	}

}
