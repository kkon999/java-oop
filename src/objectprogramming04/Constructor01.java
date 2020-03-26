package objectprogramming04;

class Print{
	
	public String delimiter = "";
	
	public Print(String delimiter) {	// 인스턴스를 생성시 클래스 이름과 똑같은 메소드를 생성 할 수가 있는데 그게 바로 생성자이다
		this.delimiter = delimiter;		// "----"를 인자로 받아 delimiter를 매개변수로 사용하여 this.delimiter이 가리키는 delimiter 인스턴스 메소드에 저장  
	}									// 클래스가 인스턴스화 될 떄 가장 먼저 실행되어야 할 메소드들을 생성자 내부에 선언하여 초기화의 목적을 달성
	
	
	public void A() {
		
		System.out.println(this.delimiter);	 // this.delimiter로 구분짓는 이유는 생성자 매개변수 delimiter와 인스턴스 메소드 delimiter의 구분을 위해서이다.
		System.out.println("A");
		System.out.println("A");
		
	}
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
	
}
public class Constructor01 {
	
	public static void main(String[] args) {
		
		Print p1 = new Print("----");	// "----"인 구분자를 생성자의 인자로 포함
		p1.A();
		p1.B();
	}

}