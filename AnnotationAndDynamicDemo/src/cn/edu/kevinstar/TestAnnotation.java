package cn.edu.kevinstar;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Administrator
 * @category �Զ���ע��
 * 
 * ������@���ſ�ͷ
 */
@Retention(RetentionPolicy.RUNTIME)//����ע��ע�͵�ע��Ὣע�ͱ�����.class�ļ��У���ΪĬ���ǲ�������
/*ָʾע�����͵�ע��Ҫ������á�
 * ���ע�����������в����� Retention ע�ͣ�
 * ��������Ĭ��Ϊ RetentionPolicy.CLASS�� 

         ֻ��Ԫע������ֱ������ע��ʱ��
   Target Ԫע�Ͳ���Ч�����Ԫע������������һ��ע�����͵ĳ�Ա������Ч�� 

*/
public @interface TestAnnotation {
	//���ͨ�����������ʹ��ע��"?"represent any class
	

}
