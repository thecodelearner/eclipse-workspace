package emp;

import java.util.Scanner;

public class Employee {
	private int empID;
	private String name;
	private float salary;
	private static int count;
	
	static{
		count = 0;
	}
	
	public Employee(){
		count++;
		this. empID = count;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Employee " + count + " name: ");
		this.name = s.next();
		
		System.out.println("Enter Employee " + count + " salary: ");
		this.salary = s.nextFloat();		
	}
	
	
	public Employee(int id, String name, float salary){
		count++;
		this.empID = id;
		this.name = name;
		this.salary = salary;		
	}
	
	
	public void display(){
		System.out.println("Employee ID: " + this.empID);
		System.out.println("Employee Name: " + this.name);
		System.out.println("Employee Salary: " + this.salary);
	}
	
	
	public static int totalEmployee(){
		return count;
	}
	
	public static void main(String[] args) {
		
	}

}
