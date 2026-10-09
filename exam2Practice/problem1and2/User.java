package problem1and2;

public class User {
	private String userName;
	private String email;
	private String password;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User() {
		this.setUserName("");
		this.setEmail("");
		this.setPassword("");
	}
	
	public User(String username, String email, String password) {
		this.setUserName(username);
		this.setEmail(email);
		this.setPassword(password);
	}
	
}
