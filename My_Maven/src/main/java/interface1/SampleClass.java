package interface1;

public class SampleClass implements InterfaceSample1{

	public   void display() 
	{
		System.out.println("abstrct method one ");
	}
	public void add()
	{
		
		System.out.println(a+b);
	}
	public void print()
	{
		System.out.println("method in class");
	}
	public static void main(String[] args) {
		 
		//SampleClass obj=new SampleClass();
		//obj.add();
		//obj.display();
		//obj.print();
		//System.out.println(obj.a);
		//System.out.println(obj.b);
		//InterfaceSample1 obj1=new InterfaceSample1();//obj create chyn pattila for interface class 
		InterfaceSample1 obj1=new SampleClass();//dbt
		obj1.add();
		//obj1.print();//not accesible this method	insode class since obj is created for interface 
	}

}
