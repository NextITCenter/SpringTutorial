package kr.or.nextit.springtutorial.cal;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CalculatorAdvice {
    @Around("execution(long kr..Calculator.factorial(int))")
    public Object measure(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.nanoTime();

        Object proceed = pjp.proceed();// ==> 실제 호출하려고 하는 메소드
        String simpleName = pjp.getTarget().getClass().getSimpleName();

        long endTime = System.nanoTime();
        System.out.println(simpleName + " 실행 시간: " + (endTime - startTime) + "ms");
        return proceed;
    }
}
