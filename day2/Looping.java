import java.util.Scanner;

public class Looping {
	public static void forLoop(){
		System.out.print("Inside For Loop: ");
		for(int i = 0; i < 10; i++)
			System.out.print(i + " ");
	}
	
	public static void whileLoop(){
		System.out.print("Inside While Loop: ");
		int i = 0;
		while (i < 10){
			i++;
			System.out.print(i + " ");
		}
	}
	
/*	public static void doWhileLoop(){
		System.out.print("Inside Do..While Loop: ");
		int i = 0;
		do{
			System.out.print(i + " ");
			i++;
		}while (i < 10);
	}
*/
	public static void main(String[] args) {
		String MESSAGE = "\nMENU\n1. For Loop\n2. While Loop\n4. Exit\nEnter Choice: ";
		int choice;
		do{
			System.out.print(MESSAGE);
			
			Scanner s = new Scanner(System.in);
			choice = s.nextInt();
			switch(choice){
				case 1: forLoop();
						break;
				case 2: whileLoop();
						break;
				//case 3: doWhileLoop(); break;
				case 4: System.out.print("Exited");
						System.exit(0);
						break;
				default: System.out.println("Invalid choice!");
						 break;
			}
		}while(choice != 4);
	}
}