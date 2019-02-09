package Sample;

public class Methodoverloading {
public void m1(String s) {
	System.out.println("String args");
}
public void m1(Object o) {
	System.out.println("object args");
}
public static void main (String[] args) {
	Methodoverloading mol=new Methodoverloading();
	mol.m1("data present in the text");
	mol.m1("null");
	mol.m1(123);
	mol.main("2fdgsd3456");
}
public static void main (Object k) {
	System.out.println("data need to be integrated");
}
}
