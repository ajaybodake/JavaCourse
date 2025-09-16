public class Car {

	int makeYear;
	String companyName;
	int gear;

	// instance block1
	{
		System.out.println("inside Car's instance block-1!!");
	}
	// instance block2
	{
		System.out.println("inside Car's instance block-2!!");
	}

	// static block1
	static 
	{
		System.out.println("inside Car's static block--2!!");
	}
	
	// static block2
	static {
		System.out.println("inside Car's static block--1!!");
	}

	public Car() {
		System.out.println("inside Car's no-arg constructor!!");
	}

	public Car(int makeYear, String companyName, int gear) {

		System.out.println("inside Car's all-arg constructor!!");
		this.makeYear = makeYear;
		this.companyName = companyName;
		this.gear = gear;
	}

	public static void main(String[] args) {
		System.out.println("main method started!!");

		Car.m2();
		
		Car c1 = new Car();
		c1.m1();
		
		System.out.println(c1.makeYear);
		System.out.println(c1.companyName);
		System.out.println(c1.gear);
		
		Car c2 = new Car(2022, "Audi", 8);

		System.out.println(c2.makeYear);
		System.out.println(c2.companyName);
		System.out.println(c2.gear);
		System.out.println("main method ended!!");

	}

	public void m1()
	{
		System.out.println("inside m1 method!!");
	}

	public static void m2()
	{
		System.out.println("inside m2 method!!");
	}
	
}
