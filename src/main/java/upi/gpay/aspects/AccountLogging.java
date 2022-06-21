package upi.gpay.aspects;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
//@EnableAspectJAutoProxy
public class AccountLogging 
{
	Date currDate = new Date();
	@Before(value="execution(* upi.gpay.service.Account.*(..))")
	public void logBefore(JoinPoint joinPoint)
	{
		System.out.println(currDate + " : Before Method To be Executed: " + joinPoint.getSignature().getName());
	}
	
	@After(value="execution(* upi.gpay.service.Account.*(..))")
	public void logAfter(JoinPoint joinPoint)
	{
		System.out.println(currDate + " : After Method Execution Completed : " + joinPoint.getSignature().getName());
	}
	
	/*@Around(value="execution(* upi.gpay.service.Account.*(..))")
	public void logAround(JoinPoint joinPoint)
	{
		
		System.out.println(currDate + " : Around Method : " + joinPoint.getSignature().getName());
		
	}*/
	
	/*@AfterReturning(value="execution(* upi.gpay.*(..))")
	public void logReturning(JoinPoint joinPoint, Object result)
	{
		System.out.println(currDate + " : After Method Execution Completed : " + joinPoint.getSignature().getName());
		System.out.println(result);
	}*/
}
