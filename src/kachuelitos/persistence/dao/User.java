package kachuelitos.persistence.dao;

public class User {

	private int dni;
	private String password;
	private String name;
	private String lasname;
	private String email;
	private int ubige;
	private String phone;
	private String address;
	private int workFlag;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int dni, String password, String name, String lasname,
			String email, int ubige) {
		super();
		this.dni = dni;
		this.password = password;
		this.name = name;
		this.lasname = lasname;
		this.email = email;
		this.ubige = ubige;
	}

	public User(int dni, String password, String name, String lasname,
			String email, int ubige, String phone, String address, int workFlag) {
		super();
		this.dni = dni;
		this.password = password;
		this.name = name;
		this.lasname = lasname;
		this.email = email;
		this.ubige = ubige;
		this.phone = phone;
		this.address = address;
		this.workFlag = workFlag;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getUbige() {
		return ubige;
	}

	public void setUbige(int ubige) {
		this.ubige = ubige;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getWorkFlag() {
		return workFlag;
	}

	public void setWorkFlag(int workFlag) {
		this.workFlag = workFlag;
	}

	public String getLasname() {
		return lasname;
	}

	public void setLasname(String lasname) {
		this.lasname = lasname;
	}

}
