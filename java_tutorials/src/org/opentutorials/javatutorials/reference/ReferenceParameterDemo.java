package org.opentutorials.javatutorials.reference;

public class ReferenceParameterDemo {
	
	
	static void _value(int b) {
		b = 2;			// int b 에 2를 대입
	}
	
	public static void runValue() {
		int a = 1;		// int a 에 1을 대입
		_value(a);		// int b = a 와 같은 의미
		
		System.out.println("runValue : " + a);	// 메소드 _value에 변수 b 에 2를 대입해도 변수 a는 이미 1이라는 값을 가지고 있기에 출력값은 1이다.
	}
	
	
	static void _reference1(A b) {	// _reference1 이라는 메소드를 호출 매개변수는 b
		b = new A(2);	 // 새로운 변수b는 인스턴스 new A(2)의 값인 2를 참조 하고 있다.
	}
	
	static void runReference1() {
		A a = new A(1);	 // 변수 a에 인스턴스 A(1)를  참조
		_reference1(a);	 // A b = a 와 같은 의미
		
		System.out.println("runReference1 : " + a.id);
	}
	
	
	static void _reference2(A b) {
		b.id = 2;
	}
	
	static void runReference2() {
		A a = new A(1); // 변수 a에 인스턴스 A(1)를 참조
		_reference2(a);
		System.out.println("runReference2 : " + a.id);
	}
	
	
	public static void main(String[] args) {
		runValue();
		runReference1();
		runReference2();
	}
}
	