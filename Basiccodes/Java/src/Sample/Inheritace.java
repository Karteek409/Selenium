package Sample;

public class Inheritace {
//public static void main(String [] args) {
private int empno;
private String name;
private double basicsal,da,hra,totalsal;
public Inheritace(int empno, String Name, double basicsalary) {
this.empno=empno;
this.name=Name;
this.basicsal=basicsalary;
da=calculate_da();
hra=calculate_hra();
totalsal=da+hra+basicsalary;
}
public double calculate_da() {
	double da= (basicsal*10)/100;
	return da;
}
public double calculate_hra() {
	double hra=(basicsal*20)/100;
	return hra;
}
public double calculate_totalsal() {
	totalsal=da+hra+basicsal;
	return totalsal;
}


}

