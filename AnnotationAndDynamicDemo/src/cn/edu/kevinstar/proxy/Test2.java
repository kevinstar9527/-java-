package cn.edu.kevinstar.proxy;

import cn.edu.kevinstar.Work;

public class Test2 {
	/*
	 * 动态代理的测试类
	 * */
	
	public static void main(String[] args) {
		//使用动态代理
		Work w = new Work();//被代理者
		DynamicProxy ldp = new DynamicProxy();//代理者
		WorkIf wi = (WorkIf)ldp.bind(w);//绑定
		wi.doWork("德化");
		
		Students s = new Students();
        A a = (A)ldp.bind(s);
        a.a("黄哥哥");
	}

}
