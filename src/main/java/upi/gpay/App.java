package upi.gpay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import upi.gpay.entities.Axis;
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
        
        //XML Config
        //Dependency Injection using Constructor Method
        Bank bank = (Bank) context.getBean("axis");
        bank.showBankDetails();
        
        //Dependency Injection using Property(getter & setter) Method
        bank = (Bank) context.getBean("hdfc");
        bank.showBankDetails();
        
    }
}
