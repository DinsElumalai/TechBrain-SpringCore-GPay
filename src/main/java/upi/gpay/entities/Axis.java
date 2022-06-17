package upi.gpay.entities;

import upi.gpay.service.Bank;

public class Axis implements Bank
{

	private String bankName;
	private String ifsc;
	private String branch;
	
	public Axis(String bankName, String ifsc, String branch)
	{
		super();
		this.bankName = bankName;
		this.ifsc = ifsc;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Axis [bankName=" + bankName + ", ifsc=" + ifsc + ", branch=" + branch + "]";
	}

	public String getBankName() {
		return bankName;
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

	public void showBankDetails() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}
	
	
}
