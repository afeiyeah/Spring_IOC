package spring.ioc.bean;

public class SingletonTest {
	//声明私有的构造方法
	private SingletonTest(){
		
	}
	//构建一个当前类的对象
	private static SingletonTest single=new SingletonTest();
	//提供一个方法用来返回生成的类对象
	public static SingletonTest getInstance(){
		return single;
	}
	
}
