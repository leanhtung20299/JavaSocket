package Entity;

import java.io.Serializable;

public class Account implements Serializable{
	private String username;
	private String password;
	private String name;
	private boolean gender;
	private String birthday;
	private String address;
	private float score;
	private String Email;
	private String phone;
	private boolean status;
	

	public Account(String username, String password, String name, boolean gender, String birthday, String address,
			float score, String email, String phone, boolean status) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.score = score;
		Email = email;
		this.phone = phone;
		this.status = status;
	}

    public Account(String username, String password) {
        this.username = username;
		this.password = password;
    }

    public Account() {
        
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
            return password+" "+username;
	}
}
