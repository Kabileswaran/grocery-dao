package ksmproduct;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class KsmOrderDao {
	Scanner Sc = new Scanner(System.in);
	KsmcustomerStore str = new KsmcustomerStore(username, password, firstname, lastname, address, phone,emailid);
	Connection con = GetConnection.getConnections();
	String query = "insert into bus (user_name ,password,first_name,last_name,address,phone, email) values(?,?,?,?,?,?,?)";
	PreparedStatement stmt = con.prepareStatement(query);
	stmt.setString(1, str.getUsername());
	

}
