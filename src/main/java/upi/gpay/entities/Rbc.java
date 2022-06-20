package upi.gpay.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import upi.gpay.service.Account;
import upi.gpay.service.Bank;

@Component
public class Rbc implements Bank
{
	@Value("RBC Bank")
	private String bankName;
	@Value("1258967")
	private String ifsc;
	@Value("Mandrid")
	private String branch;
	
	@Autowired
	@Qualifier("savingsAccount")
	private Account account;
	
	/*public Rbc(String bankName, String ifsc, String branch)
	{
		super();
		this.bankName = bankName;
		this.ifsc = ifsc;
		this.branch = branch;
	}*/

	
	public String getBankName() {
		return bankName;
	}

	@Override
	public String toString() {
		return "Rbc [bankName=" + bankName + ", ifsc=" + ifsc + ", branch=" + branch + ", account=" + account + "]";
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void showBankDetails() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}
	
}
