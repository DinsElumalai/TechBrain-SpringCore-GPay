package upi.gpay.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import upi.gpay.service.Account;

@Component
@Primary
@Scope("prototype")
public class CurrentAccount implements Account
{

	@Value("Current")
	private String accountType;

	@Override
	public String toString() {
		return "Account [accountType=" + accountType + "]";
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void showAccountType() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}
}
