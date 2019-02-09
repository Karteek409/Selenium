package methooverloading;

public class Child extends Parent {
	
	public void m1(int i) {
		System.out.println("integer args");
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1("jsfjfdsfd");
		p.m1(5678);
		Parent c= new Child();
	c.m1(6789);
	}

}
