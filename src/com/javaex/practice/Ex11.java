package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
System.out.println("숫자를 입력하세요.");
		
		int top; // 가장 큰 수
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		
		if(one > two && one > three) {
			top = one;
		} else if(two > one && two > three) {
			top = two;
		} else {
			top = three;
		}
		System.out.println("가장 큰 수는 :" + top);



		
		
		sc.close();
	}

}
