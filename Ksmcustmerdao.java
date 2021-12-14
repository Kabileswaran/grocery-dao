package ksmproduct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ksmcustmerdao {
Scanner sc =new Scanner(System.in);
	
	public  void insert() throws ClassNotFoundException, SQLException
	{
		char check;
		System.out.println("Do You Want Enter login \n Y /N");
		check=sc.nextLine().charAt(0);
	if(check =='y'||check=='Y')
		{
			System.out.println("Enter the userName");
			String username=sc.nextLine();
			System.out.println("Enter the password");
			String password=sc.nextLine();
			System.out.println("Enter the customerid");
			int cusid =Integer.parseInt(sc.nextLine());
			System.out.println("Enter the firstName");
			String firstname=sc.nextLine();
			System.out.println("Enter the lastName");
			String lastname=sc.nextLine();
			System.out.println("Enter the address");
			String address=sc.nextLine();
			System.out.println("Enter the phonenumber");
			double phone =Double.parseDouble(sc.nextLine());
			KsmcustomerStore str=new KsmcustomerStore(username,  password,  cusid,  firstname,  lastname, address, phone);
			Connection con = GetConnection.getConnections();
			 String query="insert into ksm_customers values(?,?,?,?,?,?,?)";
			    PreparedStatement stmt=con.prepareStatement(query);
			    stmt.setString(1,str.getUsername());
			    stmt.setString(2,str.getPassword());
			    stmt.setInt(3,str.getCustomerid());
			    stmt.setString(4, str.getFirstName());
			    stmt.setString(5, str.getLastName());
			    stmt.setString(6, str.getAddress());
			    stmt.setDouble(7, str.getPhonenumber());
			    stmt.executeUpdate();
			    System.out.println("successful ");
		}
		
		
	}
	public void changepassword() throws ClassNotFoundException, SQLException
	{
		System.out.println("enter the new password ");
		String passname=sc.nextLine();
		System.out.println("enter the phone number");
		double phone =Double.parseDouble(sc.nextLine());
		KsmcustomerStore str=new KsmcustomerStore();
		str.setUsername(passname);
		str.setPhonenumber(phone);
		Connection con = GetConnection.getConnections();
		 String query="update table ksm_customers set password = ? where phonenumber=?";
		    PreparedStatement stmt=con.prepareStatement(query);
		    stmt.setString(1,str.getPassword());
		    stmt.setDouble(2, str.getPhonenumber());
		    stmt.executeUpdate();
		    System.out.println("password update successful ");
	}
	
}
