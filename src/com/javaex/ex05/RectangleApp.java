package com.javaex.ex05;

public class RectangleApp {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(6, 4);
		Rectangle c = new Rectangle(12, 2);
		Rectangle d = new Rectangle(3, 8);
		Rectangle e = new Rectangle(12, 4);
		
		System.out.println(a.equals(b)); //true
		System.out.println(a.equals(c)); //true
		System.out.println(a.equals(d)); //true
		System.out.println(a.equals(e)); //false
		System.out.println(d.equals(e)); //false

	}

}
