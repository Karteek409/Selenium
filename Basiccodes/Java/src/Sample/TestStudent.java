package Sample;
import java.util.Scanner;

public class TestStudent {

public static void main(String[] args) {
Student std1=new Student();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Student details -- Id:");
int j=sc.nextInt();
std1.setstudentid(j);
System.out.println("Student name:");
//Scanner sc2=new Scanner(System.in);
sc.next();
String i=sc.nextLine();
std1.setstudentname(i);
	std1.getstudentdetails();
	}

}
