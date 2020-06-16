package objectprogramming05;

public class method01 {

	
	
	    long add(long a, long b) {
	        return a + b;
	    }
	 
	    long substract(long a, long b) {
	        return a - b;
	    }
	 
	    long multiply(long a, long b) {
	        return a * b;
	    }
	 
	    double divide(double a, double b) {
	        return a / b;
	    }
	 
	    public static void main(String[] args) {
	    	method01 math = new method01();
	        long calResult = math.add(10L, 20L);
	    }
	

	
}
