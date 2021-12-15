package ksmproduct;

import java.sql.SQLException;
import java.util.Scanner;

public class GrocceryMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome\n 1)login\n 2)register");
		n = Integer.parseInt(sc.nextLine());
		switch (n) {
		case 1:
			KsmCustmerDao obj = new KsmCustmerDao();
			obj.login();
			break;
		case 2:
			KsmCustmerDao obj1 = new KsmCustmerDao();
			obj1.insert();
			obj1.login();
			break;
		default:
			System.out.println("enter the valid option");
			break;

		}
		System.out.println(" 1)view product/n 2)exit");
		n = Integer.parseInt(sc.nextLine());
		
		switch (n) {
		case 1:
			KsmProjectDao obj = new KsmProjectDao();
			obj.viewValue();
			//System.out.println(" 2)add product to cart");
			break;
		case 2:
			KsmCustmerDao obj1 = new KsmCustmerDao();
			obj1.insert();
			break;
		default:
			System.out.println("enter the valid option");
			break;

		}
		

	}

}
