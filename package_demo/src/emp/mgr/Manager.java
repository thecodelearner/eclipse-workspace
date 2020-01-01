package emp.mgr;

import emp.*;

public class Manager extends Employee {
	private double incentives;
	
	public Manager(){
		super();
		incentives = 1000.00;
	}
	
	public Manager(int empID, String name, float salary, double incentives){
		super(empID, name, salary);
		this.incentives = incentives;
	}
	
	
	@Override
	public void display(){
		super.display();
		System.out.println("Manager Incentives: " + this.incentives);
	}
}
