package ksmproduct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ksmorderitemdao {
	Scanner sc = new Scanner(System.in);
	public void addToCart()
	{ int cout= 1;
		char check ;
		do {
		System.out.println("enter the product name want to  added to cart");
		String pname=sc.nextLine(); 
		System.out.println("enter the quantity");
		int qp =Integer.parseInt(sc.nextLine());
		
		Connection con = GetConnection.getConnections();
		String query ="insert into cart value (?,?,?)";
		Ksmorderitemstore str = new Ksmorderitemstore();
		
		    PreparedStatement stmt=con.prepareStatement(query);
		    stmt.setInt(1, str.getProductId());
		    stmt.setString(2, str.getProductName());
		    stmt.setDouble(3, str.getProductPrice());
		    stmt.executeUpdate();
		    System.out.println("Product Added");
		
		System.out.println("do you want another product ");
		System.out.println("enter y to continue");
		 check=sc.nextLine().charAt(0);
		} while (check =='y'||check=='Y');
		cout++;
			
	}

}
