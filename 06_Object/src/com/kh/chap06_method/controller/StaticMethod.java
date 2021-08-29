package com.kh.chap06_method.controller;

public class StaticMethod {

	// 1. 매개변수 없고 반환값도 없는 메소드
	public static void method1() {
		System.out.println("매개변수와 반환값 둘 다없는 static메소드입니다.");
	}
	
	// 2. 매개변수 없고 반환값은 있는 메소드
	public static int method2() {
		System.out.println("매개변수 없고 반환값은 있는 static메소드입니다.");
		
		int sum = 0;
		int random = (int)(Math.random() * 100 + 1);
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	// 3. 매개변수 있고 반환값은 없는 메소드
	public static void method3(String name) {
		System.out.println("매개변수 있고 반환값은 없는 static메소드입니다.");
		System.out.println(name + "님의 방문을 환영합니다.");
	}
	
	// 4. 매개변수 있고 반환값도 있는 메소드
	public static boolean method4(String str1, String str2) {
		System.out.println("매개변수와 반환값 둘 다있는 static메소드입니다.");
		/*
		if(str1.equals(str2)) {
			return true;
		}else {
			return false;
		}
		*/
		
		return str1.equals(str2);
	}
}
