package PrimitiveParamPassing;

public class PrimitivesPassing {

	public static void main(String[] args) {
		
		
		        int x = 1;
		        int y = 2;
		       		         
		        modify(x, y);
		        
		        System.out.println("x = "+x+"\n"+"y = "+y);
		         
    }
		     
    public static void modify(int x1, int y1) 
    {
	        x1 = 5;
	        y1 = 10;
	
	}

}
