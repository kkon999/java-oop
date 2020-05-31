package objectprogramming06;

abstract class Figure {
    abstract void area(int a, int b);
}
//추상클래스를 상속받는 자식 클래스 생성
class Ractangle extends Figure {
    void area (int a, int b) {
        System.out.println("사각형의 넓이 : " + (a * b));
    }
}

public class AbstractDemo03 {
		public static void main(String[] args) {
	        Ractangle ract = new Ractangle();
	        ract(2, 3);
		}

}
