
public class MethodOverloading {
	
	public void add(int a, int b, int c)
	{
		int result = a+b+c;
		System.out.println("a + b + c = "+ result);
	}
	
	public void add(int a, int b)
	{
		int result = a+b;
		System.out.println("a + b = "+ result);
	}
	
	public void add(double a, double b)
	{
		double result = a+b;
		System.out.println("a + b = "+result);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading o1 = new MethodOverloading();
		o1.add(1, 6);
		o1.add(10.0, 5.5);
		o1.add(11,12,13);
	}

}
