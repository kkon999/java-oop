package org.opentutorials.javatutorials.constant2;

public class ConstantDemo {

	public static void main(String[] args) {
		
		// 아래에 있는 주석이 삭제되게 되면 case 1,2,3이 의미하는게 어떤건지 알 수 없게 된다.
		/*
		 * 1. 사과
		 * 2. 복숭아
		 * 3. 바나나		
		 */
		
		int type = 1;
		switch (type) { // type 이라는 변수를 정함
		case 1:
			System.out.println(57);
			break;
		case 2:
			System.out.println(70);
			break;	
		case 3:
			System.out.println(100);
			break;
		}
	}
}

