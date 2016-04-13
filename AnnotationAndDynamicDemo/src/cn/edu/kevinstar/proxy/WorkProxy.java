package cn.edu.kevinstar.proxy;

import java.util.logging.Level;
import java.util.logging.Logger;

import cn.edu.kevinstar.Work;

/*
 * 
 * 代理work类处理日志文件
 * 1.如何将代理与代理类关联起来
 * */
public class WorkProxy {
	
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private Work work;
	
	public WorkProxy() {
		super();
	}

	public WorkProxy(Work work) {
		super();
		this.work = work;
	}

	//代理方法，完成的仅仅是被代理者不愿意去做的事情（），其他工作还由被代理者来完成
    public void proxy(String name){
    	
    	logger.log(Level.INFO,name+"开始工作........");
    	work.doWork(name);//执行被代理类的业务逻辑代码
		logger.log(Level.INFO,name+"结束了工作................");
    }
}
