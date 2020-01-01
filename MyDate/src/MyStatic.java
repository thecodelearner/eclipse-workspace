
public class MyStatic {

	static int k =10;
	
	public static void show()
	{
		System.out.println("Inside the class k: "+k);
	}
	
	static
	{
		System.out.println("Static block called");
		k++;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Inside Main");
		show();
	    
	}
	
}
