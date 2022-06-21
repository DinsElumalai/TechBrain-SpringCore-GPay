package upi.gpay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import upi.gpay.entities.Axis;
import upi.gpay.entities.Rbc;
import upi.gpay.service.Account;
import upi.gpay.service.Bank;
import upi.gpay.serviceImpl.CurrentAccount;
import upi.gpay.serviceImpl.LoanAccount;
import upi.gpay.serviceImpl.SavingsAccount;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to GPay" );
        
        
        //Normal way to create object
        Axis axis = new Axis("Axis", "123456", "Chennai");
        System.out.println(axis);
        
        
        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        Bank bank = null;
        
       //XML Config
        //Dependency Injection using Constructor Method
        bank  = (Bank) context.getBean("axis");
        bank.showBankDetails();
        
        //Dependency Injection using Property(getter & setter) Method
        bank = (Bank) context.getBean("hdfc");
        bank.showBankDetails();
        
        //Annotation Config
        bank = (Bank) context.getBean("rbc");
        bank.showBankDetails();
        
        Account account = (Account) context.getBean("savingsAccount");
        account.showAccountType();
        //account.setAccountType("Savings Account");
        
        Account account2 = (Account) context.getBean("savingsAccount");
        account2.showAccountType();
        
        Account cAccount = (Account) context.getBean("currentAccount");
        cAccount.showAccountType();
        //cAccount.setAccountType("Current Account");
        cAccount.addAccount();
        
        Account cAccount2 = (Account) context.getBean("currentAccount");
        cAccount2.showAccountType();
        
        Account lAccount = (Account) context.getBean("loanAccount");
        lAccount.addAccount();
        lAccount.removeAccount();
    }
}
