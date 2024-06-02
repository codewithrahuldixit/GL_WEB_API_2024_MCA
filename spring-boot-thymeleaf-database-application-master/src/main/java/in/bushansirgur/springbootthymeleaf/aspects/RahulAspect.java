package in.bushansirgur.springbootthymeleaf.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class RahulAspect {

	private Logger logger =  LoggerFactory.getLogger(getClass());
	/*
	@Before("execution (* in.bushansirgur.springbootthymeleaf.controller.*.*(..))")
	public void controllerAdviceBefore(JoinPoint joinpoint) {
		logger.info("Before - The Controller Advice is Executed {}", joinpoint);
	}
	@After("execution (* in.bushansirgur.springbootthymeleaf.controller.*.*(..))")
	public void controllerAdviceAfter(JoinPoint joinpoint) {
		logger.info("After - The Controller Advice is Executed {}", joinpoint);
	}
	
	@AfterThrowing(
			pointcut = "execution (* in.bushansirgur.springbootthymeleaf.controller.*.*(..))",
			throwing = "exception"
			)
	public void controllerAdviceAfterThrowing(JoinPoint joinPoint, Exception exception) {
			logger.info("Controller AfterThrowing Aspect - {} has thrown an exception {}"
			, joinPoint, exception);
	}*/
	
	@Around("execution (* in.bushansirgur.springbootthymeleaf.controller.*.*(..))")
	public Object controllerAdviceAround(ProceedingJoinPoint pjp) {
		//Start a timer
		long startTimeMillis = System.currentTimeMillis();
		//Execute the method
		Object returnValue= null;
		try {
			returnValue = pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Stop the timer
		long stopTimeMillis = System.currentTimeMillis();
		long executionDuration = stopTimeMillis - startTimeMillis;
		logger.info("Around Aspect - {} Method executed in {} ms"
		,pjp, executionDuration);
		return returnValue;

		
		//logger.info("Before - The Controller Advice is Executed {}", joinpoint);
	}

	
}
