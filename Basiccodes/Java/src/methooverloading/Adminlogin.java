package methooverloading;

import org.testng.annotations.BeforeTest;
 
public class Adminlogin {
	public static void main(String[] args) {

		Primusbank phome=new Primusbank();
		
		Primusbank.launchApp("http://primusbank.qedgetech.com");
		
		
		boolean res=phome.admniLogin("Admin", "Admin");
		if (res) 
		{
			System.out.println("Admin Login Test Pass");
		} 
		
		else {
			System.out.println("Admin Login Test Fail"); }
		
		Primusbank.closeApp();

	}

}