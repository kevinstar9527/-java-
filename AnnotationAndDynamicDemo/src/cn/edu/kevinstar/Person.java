package cn.edu.kevinstar;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Administrator
 * @category 测试javaBean类
 */
public class Person {
	
	/* 表示一个方法声明打算重写超类中的另一个方法声明。
	 * 如果方法利用此注释类型进行注解但没有重写超类方法，
	 * 则编译器会生成一条错误消息。 
     */

	@Override
	public String toString() {
	
		return super.toString();
	}
	
	/*用 @Deprecated 注释的程序元素，
	 * 不鼓励程序员使用这样的元素，
	 * 通常是因为它很危险或存在更好的选择。
	 * 在使用不被赞成的程序元素或在不被赞成的代码中执行重写时，
	 * 编译器会发出警告。 
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
