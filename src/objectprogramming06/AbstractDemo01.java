package objectprogramming06;


abstract class Toy{ // 추상 메서드를 포함하므로 추상클래스로 선언
	
    abstract void call(); // 추상 메서드 선언(구현x)
    void call2(){
        System.out.println("자동차");
    }
}
 
//Cat 추상클래스를 상속한 클래스들
class FirstCat extends Toy {
	
    void call(){ //추상메서드는 서브클래스에서 반드시 재정의 되어야 함
        System.out.println("빨간 자동차");
    }
}
 
class SecondCat extends Toy {
	
    void call(){
        System.out.println("노란 자동차");
    }
}


public class AbstractDemo01 {
	
    public static void main(String[] args) {
        FirstCat fc = new FirstCat();
        SecondCat sc = new SecondCat();
        
        sc.call2();
        fc.call2();
        
        fc.call();
        sc.call();
        
        
    }
}