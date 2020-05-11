package NonPrimitiveParamPassing;

class Num
{
	public int value;
	
	public Num(int value) 
	{
		this.value=value;
	}
}


public class NonPrimitivePassing {

	public static void main(String[] args) {
		
		Num a = new Num(1);
		Num b = new Num(1);
		
		modify(a, b);
		
		System.out.println("a = "+a.value+"\n"+"b = "+b.value);
		
		
	}
	
	public static void modify(Num a1, Num b1)
	{
		a1.value++;
		
		a1=null;
		
		b1 = new Num(1);
		b1.value++;
		
		//System.out.println("\n"+"a1 = "+a1.value+"\n"+"b1 = "+b1.value+"\n");
	}

}

