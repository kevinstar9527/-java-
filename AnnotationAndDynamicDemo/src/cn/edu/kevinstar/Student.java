package cn.edu.kevinstar;

import java.util.logging.Level;
import java.util.logging.Logger;

import cn.edu.kevinstar.proxy.WorkProxy;

@TestAnnotation
public class Student {
	
	/*
	 * 
	 * ��һ�γ����д������ִ���
	 * 1.һ����ҵ���߼�����
	 * 2.һ������ҵ���߼��޹صĴ���,����Ҫ����,���ǳ�֮Ϊ��ҵ���߼�����
	 * 
	 * ��־��������������ֲ���д��ô��Ĵ������취
	 * 1.д������
	 * 2.ͨ��������д��־
	 * 3.����������ν��������뱻�������������
	 * */
	private static  Logger logger = Logger.getLogger("");
	
	public static void main(String[] args) {
		
		//���ͨ�����������ʹ��annotation
		Class<?> ta = Student.class;
		//������������֪��Ϊ��һ�㿴����д�Ĵ����л���һ����һ������֮���пո���
		//������ڸ�Ԫ�ص�ָ�����͵�ע�ͣ��򷵻���Щע�ͣ����򷵻� null��
		TestAnnotation ma = ta.getAnnotation(TestAnnotation.class);
		System.out.println(ma);
		boolean flag = ta.isAnnotationPresent(TestAnnotation.class);
		System.out.println(flag);
		System.out.println("_____________________");
	    logger.log(Level.INFO,"......");
	   
	    //ͨ������ͱ������߹���������̫��һ
	    
	    Work work = new Work();
	    WorkProxy proxy = new WorkProxy(work);
	    proxy.proxy("��ϣ");
	
	   
	}
	

}
