package cn.edu.kevinstar;

import cn.edu.kevinstar.proxy.WorkIf;

/*
 * ������
 * */
public class Work implements WorkIf {

	public void doWork(String name){
		
		System.out.println(name+"����Ŭ������.............");
	}
}
