package org.framestudy.spring_mybatis.aspectj;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.ibatis.session.SqlSession;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.framestudy.spring_mybatis.utils.SessionUtils;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspectj {
	
//	private UserMapper um;
	private SqlSession session = null;
	
					//切入点表达式：* 号代表返回值类型 为 所有类型
//	@Pointcut(value="execution(* org.framestudy.spring_mybatis.*mag.dao.impl.*.*())")
//	private void myPointcut(){}	//切入点签名
	
	@Before(value="execution(* org.framestudy.spring_mybatis.*mag.dao.impl.*.*(..))")
	public void before(JoinPoint jp){
		
		System.out.println("*************** 进入AOP ***************");
		
		Object obj = jp.getTarget();	//目标对象
		Class cla = obj.getClass();	//目标对象的class对象
		session = SessionUtils.getSession();	//获得会话连接对象
		
		try {
			Method method = cla.getMethod("setSession", SqlSession.class);
			method.invoke(obj, session);
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterReturning(returning="obj",pointcut="execution(* org.framestudy.spring_mybatis.*mag.dao.impl.*.*(..))")
	public void afterReturning(JoinPoint jp,Object obj){
		 session.commit();
		 session.close();
	}
	
	@AfterThrowing(throwing="obj",pointcut="execution(* org.framestudy.spring_mybatis.*mag.dao.impl.*.*(..))" )
	public void afterThrowing(JoinPoint jp,Object obj){
		session.rollback();
		session.close();
	}
	
}
