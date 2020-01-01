
public class UseOfThis {
	int a;
	public UseOfThis() {
		a=10;
	}
	public void modify()
	{
		int a;
		a=this.a+2;
		System.out.println("local value of a: "+a);
	}
	public void disp()
	{
			System.out.println("class value of a: "+a);
	}
	public static void main(String[] args) {
		UseOfThis o1 = new UseOfThis();
		o1.modify();
		o1.disp();
	}

}
