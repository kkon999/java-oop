package objectprogramming07;

interface Animal {
    public void cry();
    public void sleep();
}
 
class Dog implements Animal{
 
    @Override
    public void cry() {
        System.out.println("왈!! 왈왈!! 왈왈~!!! 왈월워뤙왈!!! 멍멍!");
    }
    @Override
    public void sleep() {
        System.out.println("자신의 집에서 잠을 잡니다.");
    }
     
}
 
class Cat implements Animal{
 
    @Override
    public void cry() {
        System.out.println("야옹~~ 옹옹 야오우오우오~");
    }
    @Override
    public void sleep() {
        System.out.println("집사 얼굴 위에서 잠을 잡니다");
    }
     
}

public class InterfaceDemo01 {
	
	public static void main(String[] args) {
		Animal dog=new Dog();
        dog.cry();
        dog.sleep();
         
        System.out.println();
         
        Animal cat=new Cat();
        cat.cry();
        cat.sleep();
	}

}
