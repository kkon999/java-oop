package objectprogramming06;

public class AbstractDemo02 {


	abstract class Animal {
	    public String sName;
	    public void move() {
	        System.out.println("어슬렁 어슬렁");
	    }
	    abstract void howl();
	}

	class Dog extends Animal {
	    public void move() {
	        System.out.println("팔짝 팔짝");
	    }

	    void howl() {
	            System.out.println("멍멍");
	    }
	}

	class Cat extends Animal {
	    void howl() {
	            System.out.println("냐옹");
	    }
	}

	public class Tut02 {
	    public void main(String[] args) {
	        Dog happy = new Dog();
	        Cat julia = new Cat();
	        happy.move(); // 오버라이드된 멤버함수 호출
	        happy.howl(); // 구현된 멤버함수 호출
	        jular.move(); // 일반 멤버함수 호출
	        julia.howl(); // 구현된 멤버함수 호출
	    }
	}
	
	
}
