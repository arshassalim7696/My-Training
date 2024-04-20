package abstraction;

public class TestClass extends AbstractClass{

	
	public  void print() //abstrct method
	{
		System.out.println("this is abstract method ");
	}
	public void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		 
		TestClass obj=new TestClass();
		obj.print();
		obj.display();
		obj.add();
	}

}
