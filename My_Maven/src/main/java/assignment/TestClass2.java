package assignment;

public class TestClass2 extends AbstrctSample{

	
	
	public  void student()
	{
		String name="anu";
		int age=9;
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		TestClass2 obj=new TestClass2 ();
		obj.student();
		obj.display();
		
	}

}
