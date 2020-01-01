
class Rectangle1 {
	int length, breadth;
	
	public Rectangle1(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public Rectangle1(){
		this.length = 0;
		this.breadth = 0;
	}
	
	public Rectangle1(Rectangle1 r){
		this.length = r.length;
		this.breadth = r.breadth;
	}
	
	public int calcArea() {
		System.out.println("Length = " + length);
		System.out.println("Breadth = " + breadth);
		return (length * breadth);
	}
}


public class ConstructorDemo {

	public static void main(String[] args) {
		
		Rectangle1 firstRec = new Rectangle1();
		System.out.println("firstRec Area: " + firstRec.calcArea());
		
		Rectangle1 secRec = new Rectangle1(10, 20);
		System.out.println("secRec Area: " + secRec.calcArea());
		
		Rectangle1 copyRec = new Rectangle1(secRec);
		System.out.println("copyRec Area: " + copyRec.calcArea());
	}
}
