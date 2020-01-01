
class MyDate{
	int dd, mm, yy;
	    MyDate(){
	    	dd = 12;
	    	mm = 12;
	    	yy = 12;
		}
	    MyDate(int d, int m, int y){
			dd=d;
			mm=m;
			yy=y;
		}
		
	public void DispDate()
	{
		System.out.println("Date is : "+dd+"/"+mm+"/"+yy);
	}
	
	public static void main(String[] args)
	{
		MyDate o1= new MyDate();
		o1.DispDate();
		MyDate o2 = new MyDate(31,12,19);
		o2.DispDate();
	}

}

