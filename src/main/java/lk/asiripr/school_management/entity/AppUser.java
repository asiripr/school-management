package lk.asiripr.school_management.entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class AppUser {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int uid;
	
	private String fName;
	private String lName;
	
	@Column(unique=true, nullable=false)
	private String email;
	
	private String address;
	private String password;
	private String role;
	private String createdAt;
	
	// GETTERS AND SETTERS ------------
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}		
}
