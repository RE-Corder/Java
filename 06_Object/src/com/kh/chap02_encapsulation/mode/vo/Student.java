package com.kh.chap02_encapsulation.mode.vo;

public class Student {

	private String name;
	private int age;
	private double height;
	private int korScore;
	private int mathScore;
	
	/*
	 * * 메소드 
	 * <표현법>
	 * 접근제한자 [예약어] 반환형 메소드명 ([매개변수]){
	 * 		//기능구현
	 * }
	 */
	
	 // setter 메소드
	 //	해당 필드에 대입시키고자 하는 값 전달받아 해당 필드에 대입시켜주는 기능의 메소드
	public void setName(String name) { // String name = "홍길동";
		// 매개변수 : 해당 메소드 호출시 전달값을 받아주기 위한 변수선언문(이 메소드 내에서만 사용가능)
		//name = name; // 매개변수name = 매개변수name; 형식
					 // (왜? 필드명과 매개변수명이 동일한 시점에서 {} 내에 해당 변수명 제시시 해당 영역에서 만들어진 변수가 우선순위가 높음)
		
		// 필드name = 매개변수name; 원함
		this.name = name; // this에는 해당 객체의 주소값이 담겨있음
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	// getter 메소드
	// 해당 필드에 담긴값을 반환해주는 역할을 수행
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public int getKorScore() {
		return korScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}
	
	
	
}
