package Sample;

import java.sql.Time;
import java.util.Date;

public class Datefun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date d= new Date();
//Time t = new Time(9876678);
System.out.println(d);
System.out.println(java.time.LocalTime.now());
System.out.println(java.time.LocalDate.now());
	}

}
