package emp;

public class WageEmployee extends Employee{

	private int hours;
	private float rate;
	
	public WageEmployee(){
		super();
		this.hours = 0;
		this.rate = 100.00f;
	}
	
	public WageEmployee(int empID, String name, float salary, int hours, float rate){
		super(empID, name, salary);
		this.hours = hours;
		this.rate = rate;
	}
	
	@Override
	public void display(){
		super.display();
		System.out.println("WageEmployee hours: " + this.hours);
		System.out.println("WageEmployee rate: " + this.rate);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
