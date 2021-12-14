package ksmproduct;

public class KsmcustomerStore {
	private String username;
	private String Password;
	private int customerid;
	private String firstName;
	private String LastName;
	private String Address;
	private double phonenumber;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public double getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(double phonenumber) {
		this.phonenumber = phonenumber;
	}
	public KsmcustomerStore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KsmcustomerStore(String username, String password, int customerid, String firstName, String lastName,
			String address, double phonenumber) {
		super();
		this.username = username;
		Password = password;
		this.customerid = customerid;
		this.firstName = firstName;
		LastName = lastName;
		Address = address;
		this.phonenumber = phonenumber;
	}
	

}
