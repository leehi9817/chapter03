package com.javaex.ex07;

public class WrapperApp {

	public static void main(String[] args) {
		
		int no = 10;
		Integer i = new Integer(10);
		Short s = new Short((short)3);
		Byte b = new Byte((byte)3);
		
		System.out.println(no);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		
		int num01 = 10;
		int num02 = 7;
		int intResult = num01 + num02; //10 + 7
		System.out.println(intResult);
		
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(7);
		Integer result = i01 +i02;
		System.out.println(result);

		Integer i03 = 99; //new Integer(99)가 생략, 주소값에 99가 들어가는 것 아님
		
		Integer i04 = new Integer(100);
		int num99 = i04;
		
		System.out.println("===================================================");
		
		//문자열 --> int
		Integer i05 = 10;
		int r01 = i05.parseInt("12345");
		System.out.println(r01);
		
		//int --> 문자열
		/*
		String a = "안녕하세요";
		String snum = a.valueOf(555);
		System.out.println(snum);
		*/

		String snum = String.valueOf(555);
		
		String r100 = "" + 1234;
		System.out.println("안녕" + 1234);
		
		
	}

}
