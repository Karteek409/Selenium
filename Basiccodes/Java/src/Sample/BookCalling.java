package Sample;

public class BookCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisBook b1=new ThisBook();
ThisBook b2=b1.getBook();
//ThisBook b3=b1.getBook();
System.out.println(b1.hashCode());
System.out.println(b2.hashCode());
	}

}
