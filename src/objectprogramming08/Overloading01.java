package objectprogramming08;

public class Overloading01 {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}

	public void add(double a, double b) {
		System.out.println(a+b);
	}

	public void add(int a, double b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Overloading01 ol = new Overloading01();
		ol.add(1, 2);
		ol.add(2.5, 8);
		ol.add(3, 5.5);
	}


}
