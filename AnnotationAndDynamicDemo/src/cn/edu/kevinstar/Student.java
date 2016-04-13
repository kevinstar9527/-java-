package cn.edu.kevinstar;

import java.util.logging.Level;
import java.util.logging.Logger;

import cn.edu.kevinstar.proxy.WorkProxy;

@TestAnnotation
public class Student {
	
	/*
	 * 
	 * 在一段程序中存在两种代码
	 * 1.一种是业务逻辑代码
	 * 2.一种是与业务逻辑无关的代码,但需要存在,我们称之为非业务逻辑代码
	 * 
	 * 日志必须输出但是我又不想写这么多的代码解决办法
	 * 1.写代理类
	 * 2.通过代理类写日志
	 * 3.问题来了如何将代理类与被代理类关联起来
	 * */
	private static  Logger logger = Logger.getLogger("");
	
	public static void main(String[] args) {
		
		//如何通过反射机制来使用annotation
		Class<?> ta = Student.class;
		//在这里我终于知道为何一般看他们写的代码有会有一个与一个单词之间有空格了
		//如果存在该元素的指定类型的注释，则返回这些注释，否则返回 null。
		TestAnnotation ma = ta.getAnnotation(TestAnnotation.class);
		System.out.println(ma);
		boolean flag = ta.isAnnotationPresent(TestAnnotation.class);
		System.out.println(flag);
		System.out.println("_____________________");
	    logger.log(Level.INFO,"......");
	   
	    //通过代理和被代理者关联，功能太单一
	    
	    Work work = new Work();
	    WorkProxy proxy = new WorkProxy(work);
	    proxy.proxy("冠希");
	
	   
	}
	

}
