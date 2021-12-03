package com.javaex.ex03;

public class Point {

	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {

	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//메소드 g/s
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	//equals 메소드 재정의
	@Override
	public boolean equals(Object obj) {	
		//Object 사용 이유
		//-->Object 클래스 안에 equals 인자가 Object이기 때문에 오버라이딩 하기 위해서
		//-->들어올 때는 모든 종류가 다 들어올 수 있도록 상위 개념인 Object 사용
		
		//Object 형식일 때는 시선이 Object에 한정되어 Point가 가려짐
		//Point의 x와 y에 접근 불가능 
		Point p = (Point)obj;	//다운캐스팅: Point로 영역을 확장
		
		// a.equals(b)
		// a.x==b.x && a.y==b.y
		if(this.x==p.x && this.y==p.y) {			
			return true;
		} else {
			return false;
		}
		
	}
	
}
