package cn.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class AspectDemo {
	public void before(){
		System.out.println("֪ͨǰ����Ӧ");
	}
	public void afterReturning(){
		System.out.println("���غ���Ӧ");
	}
	public void afterThrowing(){
		System.out.println("�׳��쳣����Ӧ");
	}
	public void after(){
		System.out.println("������������Ӧ");
	}
	public Object around(ProceedingJoinPoint pjp){
		Object obj = null;
		try {
			System.out.println("1");
			obj = pjp.proceed();
			System.out.println("2");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}
}
