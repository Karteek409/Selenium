package Sample;
public class Thiskeyword {
private int sid;
private String name;
private double fee;
private String course;
Thiskeyword(int Sid, String Name, String Course, int Fee){
	this.sid=Sid;
	this.name=Name;
	this.course=Course;
	this.fee=Fee;
}
public void getStudentDetails() {
	System.out.println("Sid:"+sid+"\n Name:"+name+"\n Course"+course+"\n Fee"+fee);
}


}

