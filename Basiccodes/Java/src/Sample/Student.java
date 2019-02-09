package Sample;

 class Student {

	private int studentid;
	private String studentname;
	public void setstudentid(int studentid1)
	{
		studentid=studentid1;
	}
	public void setstudentname(String stdetname) 
	{
	studentname=stdetname;
	}
	public void getstudentdetails()
	{
		System.out.println("Student Details: \n");
		System.out.println("Student Id:"+studentid);
		System.out.println("Student Name:"+studentname);
	}
	}
