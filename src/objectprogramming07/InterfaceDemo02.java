package objectprogramming07;

class Car {	
    
	public int wheel; 
    public void drive() {
        System.out.println("매개 변수가 없어서 출발하지 못합니다");
    }
}
 
class RedCar extends Car {
    
    public void drive(int a) {
        System.out.println("출발합니다");
    }
}

public class InterfaceDemo02 {    
            
    public static void main(String []args) {
    	RedCar cr = new RedCar();
        
        cr.drive(3); // 매개 변수가 있을 시 
        
        cr.drive();	 // 매개 변수가 없을 시
    }
}

