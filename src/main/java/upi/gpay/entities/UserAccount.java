package upi.gpay.entities;

import org.springframework.stereotype.Component;

@Component
public class UserAccount 
{

	private int userAccountId;
	private int mobile;
	private String email;
	
	@Override
	public String toString() {
		return "UserAccount [userAccountId=" + userAccountId + ", mobile=" + mobile + ", email=" + email + "]";
	}
	public int getUserAccountId() {
		return userAccountId;
	}
	public void setUserAccountId(int userAccountId) {
		this.userAccountId = userAccountId;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
