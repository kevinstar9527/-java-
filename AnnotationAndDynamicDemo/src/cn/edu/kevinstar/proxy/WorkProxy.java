package cn.edu.kevinstar.proxy;

import java.util.logging.Level;
import java.util.logging.Logger;

import cn.edu.kevinstar.Work;

/*
 * 
 * ����work�ദ����־�ļ�
 * 1.��ν�������������������
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

	//����������ɵĽ����Ǳ������߲�Ը��ȥ�������飨���������������ɱ������������
    public void proxy(String name){
    	
    	logger.log(Level.INFO,name+"��ʼ����........");
    	work.doWork(name);//ִ�б��������ҵ���߼�����
		logger.log(Level.INFO,name+"�����˹���................");
    }
}
