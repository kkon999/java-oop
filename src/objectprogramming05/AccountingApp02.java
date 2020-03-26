package objectprogramming05;

class Accounting{ //Accountng 클래스를 생성하여 여러개의 메소드들을 한 곳에 집합
	
	// 공급가액
    public static double valueOfSupply;
    
    // 부가가치세율
    public static double vatRate = 0.1;
        
    public static double getVAT() {
        return valueOfSupply * vatRate;
    }

    public static double getTotal() {
        return valueOfSupply + getVAT();
    }
	
}

public class AccountingApp02 {
 
    public static void main(String[] args) {
    	Accounting.valueOfSupply = 10000.0;
        System.out.println("Value of supply : " + Accounting.valueOfSupply);
        System.out.println("VAT : " + Accounting.getVAT());
        System.out.println("Total : " + Accounting.getTotal());
 
    }
}