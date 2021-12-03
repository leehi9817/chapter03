package com.javaex.ex06;

public class StringApp02 {

	public static void main(String[] args) {
		
		String a = " abcd";
		String b = ",efg";
		
		//두 문자열 더하기
		System.out.println(a.concat(b));
		System.out.println(b.concat(a));
		
		a = a.concat(b);
		System.out.println(a);
		
		//공백 없애기
		a = a.trim();
		System.out.println(a);
		
		//문자 바꾸기 (ab -> 안녕)
		a = a.replace("ab", "안녕");
		System.out.println(a);
		
		String[] sArray = a.split(",");
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		String str = "Hello JAVA!";
		
		String r01 = str.substring(3);
		System.out.println(r01);
		
		String r02 = str.substring(8);
		System.out.println(r02);
		
		String r03 = str.substring(3, 8);
		System.out.println(r03);
		
	}
	
}
