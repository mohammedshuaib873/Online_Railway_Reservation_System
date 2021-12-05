package com.RailwayUserManagenet.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
 
@Document(collection="userDetails")
public class UserSignUp {
    
    @Id
    private int id;
    private String name;
    private String emailId;
    private Long contact;
    private String username;
    private String password;
    private String confirmpassword;
    
	public UserSignUp() {
		super();
	}

	public UserSignUp(int id,String name, String emailId, Long contact, String username, String password,
			String confirmpassword) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.contact = contact;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	@Override
	public String toString() {
		return "UserSignUp [id=" + id + ", name=" + name + ", emailId=" + emailId + ", contact=" + contact
				+ ", username=" + username + ", password=" + password + ", confirmpassword=" + confirmpassword + "]";
	}

    
}