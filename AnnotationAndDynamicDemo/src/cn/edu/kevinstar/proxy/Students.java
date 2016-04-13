package cn.edu.kevinstar.proxy;

public class Students implements A {

	@Override
	public void a(String name) {

		System.out.println("学生的名字是: "+name);
	}

}
