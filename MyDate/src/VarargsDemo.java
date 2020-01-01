
public class VarargsDemo {
	
	static void fun(String mssg, int ... a)
	{
		System.out.println("The message is :"+mssg);
		System.out.println("Total number of arguments is "+a.length);
		
		//using for each loop to display the content of array
		for(int i:a)
			System.out.println(i);
	}
	public static void main(String[] args)
	{
		//VarargsDemo o = new VarargsDemo();
		fun("Varargs Demo", 1, 2, 3);
	}
	

}
