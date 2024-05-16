package encapsulation;

public class encapsulation2 {
	private String name ="shivani";
	private int age = 25;
	private int salary= 100000;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

public static void main(String[] args) {
	encapsulation2 e2 = new encapsulation2();
	
	
	System.out.println(e2.getAge());
	System.out.println(e2.getName());
	System.out.println(e2.getSalary());
}
}