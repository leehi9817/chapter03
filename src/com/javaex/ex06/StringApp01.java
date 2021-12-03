package com.javaex.ex06;


public class StringApp01 {

	public static void main(String[] args) {
		
		String str01 = new String("hi"); //새 객체를 각각 생성
		String str02 = new String("hi");
		
		//두 객체의 주소값 비교
		System.out.println(str01==str02); //false
		
		System.out.println(str01.hashCode());
		System.out.println(str02.hashCode());
		
		System.out.println("=============================");
		
		String str03 = "hello"; //"hello" 객체 생성
		String str04 = "hello"; //내용이 같은 객체가 있는지 찾아보고
								//있다면 새 객체 만들지 않고 기존의 객체 가리킴
		System.out.println(str03==str04); //true
		str03 = "bye";
		
		System.out.println(str03==str04); //내용이 변경되면 객체 새로 생성
		
	}

}
