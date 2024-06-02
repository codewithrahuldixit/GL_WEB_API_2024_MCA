package in.bushansirgur.springbootthymeleaf.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@Aspect
public class LoggingAspect {
	private Logger logger = LoggerFactory.getLogger(getClass());
    
	@Before("in.bushansirgur.springbootthymeleaf.aspects.CommonPointcutConfig.businessAndDataPackageConfig()")
	public void logMethodBeforeCall(JoinPoint joinpoint ) {
		logger.info("Before Method is Called - {} with following argument {}"
				,joinpoint,joinpoint.getArgs());
	}
	
	@After("in.bushansirgur.springbootthymeleaf.aspects.CommonPointcutConfig.businessAndDataPackageConfig()")
	public void logMethodAfterCall(JoinPoint joinpoint ) {
		logger.info("After Method is Called - {}",joinpoint);
	}

	@AfterThrowing(
	pointcut = "in.bushansirgur.springbootthymeleaf.aspects.CommonPointcutConfig.businessAndDataPackageConfig()",
	throwing = "exception"
	)
	public void logMethodCallAfterException(JoinPoint joinPoint, Exception exception) {
		logger.info("AfterThrowing Aspect - {} has thrown an exception {}"
				,  joinPoint, exception);
	}

	@AfterReturning(
	pointcut = "in.bushansirgur.springbootthymeleaf.aspects.CommonPointcutConfig.businessAndDataPackageConfig()",
	returning = "resu"
	)
	public void logMethodCallAfterSuccessfulExecution(JoinPoint joinPoint, 
			Object resu) {
		logger.info("AfterReturning Aspect - {} has returned {}"
				,  joinPoint, resu);
	}

	@Around("in.bushansirgur.springbootthymeleaf.aspects.CommonPointcutConfig.businessAndDataPackageConfig()")
	public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		//Start a timer
		long startTimeMillis = System.currentTimeMillis();
		
		//Execute the method
		Object returnValue = proceedingJoinPoint.proceed();
		
		//Stop the timer
		long stopTimeMillis = System.currentTimeMillis();
		
		long executionDuration = stopTimeMillis - startTimeMillis;
		
		logger.info("Around Aspect - {} Method executed in {} ms"
				,proceedingJoinPoint, executionDuration);
		
		return returnValue;
	}


}
