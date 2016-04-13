package cn.edu.kevinstar.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * ����һ����̬�����ࣨ�����˷���Ļ��ƣ�
 * 1.�󶨴�����(����������뱻�������������)
 * */
public class DynamicProxy implements InvocationHandler{
	//delegate ����
	private Object delegate;
	
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	public Object bind(Object delegate){
		this.delegate = delegate;
		//���ص��������ʵ�ֵĽӿ�
		//��ִ���κ�һ��������ʱ���ȵ���invoke����
		//���������ʵ�ֵ��������ʵ�ֵĽӿ�
		return Proxy.newProxyInstance(this.delegate.getClass().getClassLoader(),
				this.delegate.getClass().getInterfaces(), this);
	}
    /*
     * ��������ִ�з���֮ǰ��ִ�и÷���invoke
     * */
	
	/* 
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 
	 * @param proxy �����ϵ��÷����Ĵ���ʵ��
	 * @param method ��Ӧ���ڴ���ʵ���ϵ��õĽӿڷ�����Methodʵ����
	 
	 * @param args ����
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
	throws Throwable {
		
		Object result = null;
		
		System.out.println("���ص������� : "+method.getName());
		
        if(!method.getName().equals("doWork"))
		{
			logger.log(Level.INFO,args[0]+"��ʼ����........");
			
			result = method.invoke(this.delegate,args);
			
			logger.log(Level.INFO,args[0]+"�����˹���................");
			
		}
		
		return result;//���е�һ�ж���object,�ӿ��Ƿ����ǣ���Ҳ��
	}

}
