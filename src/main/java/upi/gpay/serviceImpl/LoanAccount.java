package upi.gpay.serviceImpl;

import org.springframework.stereotype.Component;

import upi.gpay.service.Account;

@Component
public class LoanAccount implements Account
{

	public void showAccountType() {
		// TODO Auto-generated method stub
		System.out.println("Loan Account");
	}

	public void addAccount() {
		// TODO Auto-generated method stub
		System.out.println("Add Loan Account");
	}

	public String removeAccount() {
		// TODO Auto-generated method stub
		return "Remove Loan Account";
	}

}
