package cn.edu.kevinstar.proxy;

import cn.edu.kevinstar.Work;

public class Test2 {
	/*
	 * ��̬����Ĳ�����
	 * */
	
	public static void main(String[] args) {
		//ʹ�ö�̬����
		Work w = new Work();//��������
		DynamicProxy ldp = new DynamicProxy();//������
		WorkIf wi = (WorkIf)ldp.bind(w);//��
		wi.doWork("�»�");
		
		Students s = new Students();
        A a = (A)ldp.bind(s);
        a.a("�Ƹ��");
	}

}
