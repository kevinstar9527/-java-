package cn.edu.kevinstar;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Administrator
 * @category ����javaBean��
 */
public class Person {
	
	/* ��ʾһ����������������д�����е���һ������������
	 * ����������ô�ע�����ͽ���ע�⵫û����д���෽����
	 * �������������һ��������Ϣ�� 
     */

	@Override
	public String toString() {
	
		return super.toString();
	}
	
	/*�� @Deprecated ע�͵ĳ���Ԫ�أ�
	 * ����������Աʹ��������Ԫ�أ�
	 * ͨ������Ϊ����Σ�ջ���ڸ��õ�ѡ��
	 * ��ʹ�ò����޳ɵĳ���Ԫ�ػ��ڲ����޳ɵĴ�����ִ����дʱ��
	 * �������ᷢ�����档 
     */
	@Deprecated
	public void a(){
	  new Date().toLocaleString();
	}
   
	
	@SuppressWarnings("all")
	public void bb(){
		
		
		ArrayList al =new ArrayList();
		
	}
	
}
