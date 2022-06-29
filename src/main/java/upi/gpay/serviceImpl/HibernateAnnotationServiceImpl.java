package upi.gpay.serviceImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import upi.gpay.entities.MerchantAccount;
import upi.gpay.service.HibernateService;

@Component
public class HibernateAnnotationServiceImpl implements HibernateService
{
	Configuration cfg = new Configuration().configure("hbm.config.xml").addAnnotatedClass(MerchantAccount.class);
	SessionFactory sessionFactory = cfg.buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction txn = null;
	MerchantAccount account = new MerchantAccount();

	public void insertData() {
		// TODO Auto-generated method stub
		
		txn = session.beginTransaction();
		
		account.setEmail("Ss@gmail.com");
		account.setMobile("25893325");
		account.setShopType("AnimalStore");
		
		session.save(account);
		txn.commit();
	}

	public void selectData() {
		// TODO Auto-generated method stub
		
		txn = session.beginTransaction();
		account = (MerchantAccount) session.get(MerchantAccount.class, 1);
		txn.commit();
		System.out.println(account);
	}
	
	public void selectAllData()
	{
		
		txn = session.beginTransaction();
		List<MerchantAccount> merchantAccounts = session.createQuery("FROM MerchantAccount").list();
		for(MerchantAccount account : merchantAccounts)
		{
			System.out.println(account);
		}
		txn.commit();
	}

	public void updateData() {
		// TODO Auto-generated method stub
		
	}

	public void deleteData() {
		// TODO Auto-generated method stub
		txn = session.beginTransaction();
		account = (MerchantAccount) session.get(MerchantAccount.class, 52);
		session.delete(account);
		txn.commit();
	}

}
