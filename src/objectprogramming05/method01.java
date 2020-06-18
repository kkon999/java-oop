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
	        long calResult01 = math.add(10L, 20L);
	        long calResult02 = math.substract(10L, 20L);
	        long calResult03 = math.multiply(10L, 20L);
	        double calResult04 = math.divide(10L, 20L);
	        	        
	        System.out.println(calResult01);
	        System.out.println(calResult02);
	        System.out.println(calResult03);
	        System.out.println(calResult04);
	    }	
	
}
