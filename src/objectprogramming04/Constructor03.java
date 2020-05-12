package objectprogramming04;

public class Constructor03 {

	private int x1 = 0;
    private int y1 = 0;
    
    public Constructor03(int x1, int y1){
        this.x1 = x1;
        this.y1 = y1;
    }
    
    public static void main(String[] args){
    	Constructor03 cal = new Constructor03(10, 20);
        
        System.out.println("x1 : " + cal.x1);
        System.out.println("y1 : " + cal.y1);
    }
	
}
