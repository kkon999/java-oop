package org.opentutorials.javatutorials.constant2;

class Fruit{
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
	}

class Company{
	public static final Company BANANA = new Company();

}

public class ConstantDemo02 {
	 	
	public static void main(String[] args) {
		
		if(Fruit.APPLE == Company.APPLE) {
			System.out.println("과일의 이름이 같습니다.");
		}
		
    	Fruit type = Fruit.APPLE;
    	switch (type) {
    	case Fruit.APPLE:
    		System.out.println(50+" kacl");
    		break;
    	case Fruit.PEACH:
    		System.out.println(60+" kacl");
    		break;
    	case Fruit.BANANA:
    		System.out.println(70+" kacl");
    		break;
   }
  }
}
