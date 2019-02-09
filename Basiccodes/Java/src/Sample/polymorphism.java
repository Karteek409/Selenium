package Sample;

public class polymorphism {
public void m1() {
System.out.println("zero");
}
public void m1(int a) {
	System.out.println("int arg");
}
public void m1(float b) {
	System.out.println("float arg");
}
public static void main(String[] args) {
polymorphism p1=new polymorphism();
p1.m1();
p1.m1(8766.5688f);
p1.m1(345);

	}

}
