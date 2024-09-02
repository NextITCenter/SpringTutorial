package kr.or.nextit.springtutorial.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

// Advice: 조언, 충고
@Aspect
public class AOPMethodAdvice {

    /*
    @Before: 메소드가 실행되기 전에 호출
    @After: 메소드가 호출되고 종료되는 시점에 호출
    @AfterThrowing: 메소드가 실행 중에 에러를 발생했을 때 호출
    @AfterReturning: 메소드가 실행되고 정상적으로 종료될 때 호출
    @Around: 위의 4가지 설정을 모두 종합해서 사용 가능
     */
    @Before("myPointCut()")
    public void preRevoke() {
        System.out.println("AOPMethod 클래스의 메소드가 호출됨");
    }
    // 메소드 호출 후 "AOPMethod 클래스의 메소드 실행 완료" 메소드 이름: complete()
    @After("myPointCut()")
    public void complete() {
        System.out.println("AOPMethod 클래스의 메소드 실행 완료");
    }
    // PointCut 표현식
    @Pointcut("execution(void kr..*.*(..))")
    public void myPointCut() {}

    @Around("myPointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around를 통한 메소드 호출 전");
        Object proceed = null;
        try {
            // => 원래 호출하려고 했던 메소드
            proceed = joinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("Around를 통한 메소드 에러 발생시 호출");
        }
        System.out.println("Around를 통한 메소드 호출 후");
        return proceed;
    }
}
