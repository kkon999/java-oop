package org.opentutorials.javatutorials.reference;


public class ReferenceDemo1 {
	
	public static void runValue() {
		
		int a = 1;
		int b = a; 	//b에 a의 값을 대입함
		b = 2;		//b 값을 2로 변경
		System.out.println("runValue : " + a); // 변수 b는 a의 값을 복제 한 것이기 때문에 b의 값이 변경 되더라도 a의 값은 변경 되지 않는다.
	}
	
	public static void main(String[] args) {
		runValue();
		
	}
}
