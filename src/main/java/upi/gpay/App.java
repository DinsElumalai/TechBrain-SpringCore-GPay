package upi.gpay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import upi.gpay.entities.Axis;
import upi.gpay.entities.CurrentAccount;
import upi.gpay.entities.Rbc;
import upi.gpay.entities.SavingsAccount;
import upi.gpay.service.Bank;

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
        
        SavingsAccount account = (SavingsAccount) context.getBean("savingsAccount");
        account.showAccountType();
        account.setAccountType("Savings Account");
        
        SavingsAccount account2 = (SavingsAccount) context.getBean("savingsAccount");
        account2.showAccountType();
        
        CurrentAccount cAccount = (CurrentAccount) context.getBean("currentAccount");
        cAccount.showAccountType();
        cAccount.setAccountType("Current Account");
        
        CurrentAccount cAccount2 = (CurrentAccount) context.getBean("currentAccount");
        cAccount2.showAccountType();
    }
}
