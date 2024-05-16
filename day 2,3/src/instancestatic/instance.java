package instancestatic;

public class instance {
	static int a=10;
	int b=20;
	void display()
	{
		System.out.println(a);  
		System.out.println(b);
	}
	public static void main(String[] args) {
		instance i1=new instance();
		i1.display();//instace method can access both instance and static variable
		
	}
	

}
