package upi.gpay.serviceImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import upi.gpay.entities.UserAccount;
import upi.gpay.service.HibernateService;

@Component
public class HibernateServiceImpl implements HibernateService
{
	//ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
	Configuration cfg = new Configuration().configure("hbm.config.xml");
	SessionFactory sessionFactory = cfg.buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction txn = null;
	UserAccount userAccount = new UserAccount();
	
	public void insertData() {
		// TODO Auto-generated method stub
		
		//Created empty bean and assigning values
		 //UserAccount userAccount = (UserAccount) context.getBean("userAccount");
		
		 userAccount.setUserAccountId(1003);
		 userAccount.setMobile(1234567890);
		 userAccount.setEmail("test@gmail.com");
		 
		 
		 txn = session.beginTransaction();
		 session.persist(userAccount);
		 txn.commit();
	}

	public void selectData() {
		// TODO Auto-generated method stub
		
		userAccount = session.get(UserAccount.class, 1001);
		System.out.println(userAccount);
	}

	public void updateData() {
		// TODO Auto-generated method stub
		
	}

	public void deleteData() {
		// TODO Auto-generated method stub
		
	}

}
