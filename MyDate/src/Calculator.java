
import java.util.*;
public class Calculator
{

	public void addition(int a, int b)
	{
		int c = a+b;
		System.out.println(a+"+"+b+"="+c);
	}

	public void subtraction(int a, int b)
	{
		int c = a-b;
		System.out.println(a+"-"+b+"="+c);
	}

	public void multi(int a, int b)
	{
		int c = a*b;
		System.out.println(a+"*"+b+"="+c);
	}
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println(a+"/"+b+"="+c);
	}
	public static void main(String[] args)
	{
		int a ,b;
		String operator;
		Calculator c = new Calculator();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter y to use Calculator");
		String choice = s.next();

		if(choice.equals("y")) {

			do{
				System.out.println("Enter Operand1 operator(+,-,*,/) operand2 or 0e0 to exit: ");
				a = s.nextInt();
				operator= s.next();
				b = s.nextInt();
				switch(operator)
				{
				case "+": 	c.addition(a,b);
				break;
				case "-":  c.subtraction(a,b);
				break;
				case "*": c.multi(a,b);
				break;
				case "/": c.div(a,b);
				break;

				}
			}while(!operator.equals("e"));

		}
		else
			System.out.println("Bye from do while");

		System.out.println("Do you want to count from 1 to 10 using for loop then enter y: ");

		choice = s.next();

		if(choice.equals("y")) {
			int i;
			for(i=0;i<=10;i++)
				System.out.print(i+" ");
		}
		else
			System.out.println("Bye from for");


		System.out.println("Do you want to count from 1 to 10 using while loop then enter y: ");

		choice = s.next();

		if(choice.equals("y"))
		{ 
			int i=0;
			while(i<=10) 
			{ 
				System.out.print(i+" ");
				i++;
			}
		}
		else System.out.println("Bye from while");


	}
}