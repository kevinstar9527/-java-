package cn.edu.kevinstar.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * 这是一个动态代理类（利用了反射的机制）
 * 1.绑定代理者(代理类如何与被代理类关联起来)
 * */
public class DynamicProxy implements InvocationHandler{
	//delegate 代理
	private Object delegate;
	
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	public Object bind(Object delegate){
		this.delegate = delegate;
		//返回的是这个类实现的接口
		//当执行任何一个方法的时候先调用invoke方法
		//下面这个类实现的是这个类实现的接口
		return Proxy.newProxyInstance(this.delegate.getClass().getClassLoader(),
				this.delegate.getClass().getInterfaces(), this);
	}
    /*
     * 被代理类执行方法之前会执行该方法invoke
     * */
	
	/* 
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 
	 * @param proxy 在其上调用方法的代理实例
	 * @param method 对应于在代理实例上调用的接口方法的Method实例。
	 
	 * @param args 参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
	throws Throwable {
		
		Object result = null;
		
		System.out.println("拦截到代理方法 : "+method.getName());
		
        if(!method.getName().equals("doWork"))
		{
			logger.log(Level.INFO,args[0]+"开始工作........");
			
			result = method.invoke(this.delegate,args);
			
			logger.log(Level.INFO,args[0]+"结束了工作................");
			
		}
		
		return result;//所有的一切都是object,接口是方法是，类也是
	}

}
