package objectprogramming05;

class Accounting2{
	
	//물건 가격 메소드
	public double valueOfSupply;
	//부가세 가격 메소드
	public static double vatRate = 0.1; // 불변하는 메소드의 경우 클래스 소속으로 두는것을 권고
	
	public double getVAT() {
		return this.valueOfSupply * vatRate;
	}
	
	public double getTotal() {
		return this.valueOfSupply + getVAT();
	}
	
	public Accounting2(double valueOfSupply){ // 생성자를 생성하여 valueOfSupply 값을 미리 세팅
		this.valueOfSupply = valueOfSupply;
	}
}

public class AccountingApp03 {
	
	public static void main(String[] args) {
		
		Accounting2 a1 = new Accounting2(10000);
		

		System.out.println("물건의 가격은 " + a1.valueOfSupply + " 입니다.");
		System.out.println("부가세는 " + a1.getVAT() + " 입니다.");
		System.out.println("총 가격은 " + a1.getTotal() + " 입니다.");		
		System.out.println("==================================");		
	
		Accounting2 a2 = new Accounting2(20000);
		
		System.out.println("물건의 가격은 " + a2.valueOfSupply + " 입니다.");
		System.out.println("부가세는 " + a2.getVAT() + " 입니다.");
		System.out.println("총 가격은 " + a2.getTotal() + " 입니다.");		
	}
	
}
