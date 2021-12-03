package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {

		Point p00 = new Point(2, 3);
		Point p01 = new Point(2, 3);
		Point p02 = new Point(5, 9);
		Point p04 = p02;	//p02와 p04가 서로 같은 값 가리키게 함

		// getClass()
		System.out.println("#getClass()");
		System.out.println(p00.getClass());
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		System.out.println("======================================");

		// hashCode() --> 주소값에 대응되는 중복되지 않는 숫자
		System.out.println("#hashCode()");
		System.out.println(p00.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println("======================================");
		
		System.out.println("#toString()");
		System.out.println(p00.toString());
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println("======================================");
		
		System.out.println("#equals()");
		System.out.println(p00.equals(p02));	//서로 같은 객체인가?
		System.out.println(p00.equals(p01));	//내용은 같지만 서로 다른 객체이다
		System.out.println(p00==p01);			//주소값이 같은가?
		System.out.println(p02==p04);			//주소값이 서로 같다
		
	}

}
