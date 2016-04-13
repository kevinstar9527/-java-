package cn.edu.kevinstar;

import cn.edu.kevinstar.proxy.WorkIf;

/*
 * 工作类
 * */
public class Work implements WorkIf {

	public void doWork(String name){
		
		System.out.println(name+"正在努力工作.............");
	}
}
