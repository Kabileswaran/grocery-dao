package ksmproduct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class KsmCustmerDao {
	Scanner sc = new Scanner(System.in);

	public void insert() throws ClassNotFoundException, SQLException {
		
			System.out.println("Enter the userName");
			String username = sc.nextLine();
			System.out.println("Enter the password");
			String password = sc.nextLine();
			System.out.println("Enter the firstName");
			String firstname = sc.nextLine();
			System.out.println("Enter the lastName");
			String lastname = sc.nextLine();
			System.out.println("Enter the address");
			String address = sc.nextLine();
			System.out.println("Enter the phonenumber");
			
			long phone=Long.parseLong(sc.nextLine()); 
			System.out.println("Enter the email id");
			String emailid =sc.nextLine();
			
//			do
//			if (email.matches("[a-z]+[@][a-z]+[.][a-z]+"))
//			{
//				System.out.println("valid");
//			 emailid =email;
//			}
//			else 
//			{
//				System.out.println("invalid");
//				
//			}

			KsmCustomerStore str = new KsmCustomerStore(username, password, firstname, lastname, address, phone,emailid);
			Connection con = GetConnection.getConnections();
			String query = "insert into bus (user_name ,password,first_name,last_name,address,phone, email) values(?,?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, str.getUsername());
			stmt.setString(2, str.getPassword());
			stmt.setString(3, str.getFirstName());
			stmt.setString(4, str.getLastName());
			stmt.setString(5, str.getAddress());
			stmt.setLong(6, str.getPhonenumber());
			stmt.setString(7, str.getEmailid());
			stmt.executeUpdate();
			System.out.println("successful ");
		

	}

	public void changepassword() throws ClassNotFoundException, SQLException {
		System.out.println("enter the new password ");
		String passname = sc.nextLine();
		System.out.println("enter the phone number");
		long phone = Long.parseLong(sc.nextLine());
		KsmCustomerStore str = new KsmCustomerStore();
		str.setUsername(passname);
		str.setPhonenumber(phone);
		Connection con = GetConnection.getConnections();
		String query = "update table ksm_customers set password = ? where phonenumber=?";
		PreparedStatement stmt = con.prepareStatement(query);
		stmt.setString(1, str.getPassword());
		stmt.setLong(2, str.getPhonenumber());
		stmt.executeUpdate();
		System.out.println("password update successful ");
	}

	public void login() throws ClassNotFoundException, SQLException {
		boolean user= false;
		do
		{
		System.out.println("enter the username ");
		String username = sc.nextLine();
		System.out.println("enter the password");
	    String passname = sc.nextLine();
		KsmCustomerStore str = new KsmCustomerStore();
		str.setUsername(username);
		str.setPassword(passname);
		Connection con = GetConnection.getConnections();
		String query = "select first_name from bus where user_name= ? and password= ? ";
		PreparedStatement stmt = con.prepareStatement(query);
		stmt.setString(1, str.getUsername());
		stmt.setString(2, str.getPassword());
		//stmt.executeUpdate();
		ResultSet rs = stmt.executeQuery( );
		if (rs.next()) {
			System.out.println("welcome "+rs.getString("first_name") );
			user= false;
		} 
		else
		{
		System.out.println("error");
		user=true;
		}
		}while(user);
	}
}
