
public class DemoStatic {
	
	static int i;
	
	public static void show(){
		System.out.println("Inside the class show method: " + i);
	}
	
	
	static{
		System.out.println("Static block called");
		i++;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Main method called");
		DemoStatic.show();
	}

}
