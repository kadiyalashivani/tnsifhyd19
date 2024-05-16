package instancestatic;

public class staticmethod {
	static int a=10;
	int b=20;
	static void display()
	{
		System.out.println(a);  
		//System.out.println(b);
	}

	public static void main(String[] args) {
		staticmethod s1= new staticmethod();
		System.out.println(a);
		//s1.display(); we can access static variable but cannot access the instance variable in static method

	}

}
