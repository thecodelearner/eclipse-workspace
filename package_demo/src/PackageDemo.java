import emp.*;
import emp.mgr.Manager;

public class PackageDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.display();
		System.out.println("Total Employee: " + Employee.totalEmployee());
		
		WageEmployee w1 = new WageEmployee();
		w1.display();
		System.out.println("Total Employee: " + Employee.totalEmployee());
		
			
		Manager m1 = new Manager();
		m1.display();
		System.out.println("Total Employee: " + Employee.totalEmployee());
	}

}
