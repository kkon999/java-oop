package objectprogramming05;


public class instance01 {
	static int number;
	int speed;
	String color;
 
	public void speedUp() {
		
	      System.out.println("속도를 올린다!!");
	      
	}
	public void speedDown() {
		
	      System.out.println("속도를 내린다!!");
	      
	}
 
	public static void main(String[] args) {
	  
		instance01 myCar = new instance01();
		instance01 yourCar = new instance01();
		
		myCar.speed = 10;
		System.out.println(myCar.speed);
		System.out.println(yourCar.speed);
	  
	}

}
