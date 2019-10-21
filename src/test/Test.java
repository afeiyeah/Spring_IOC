package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import spring.ioc.bean.ExampleBean;
import spring.ioc.bean.FirstBean;
import spring.ioc.bean.NewExampleBean;
import spring.ioc.bean.student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 加载Spring容器（BeanFactory/ApplicationContext）
		 * ApplicationContext接口是在BeanFactory接口基础之上的，相对高级的容器实现
		 * BeanFactory默认都是默认延迟初始化bean元素
		 * ApplicationContext是非延迟初始化所有bean元素
		 * Spring提供了两种不同的容器：一种是最基本的BeanFactory，另一种是扩展的ApplicationContext。
		 * BeanFactory 仅提供了最基本的依赖注入支持，而 ApplicationContext 则扩展了BeanFactory ,提供了更多的额外功能。
		 * 二者对Bean的初始化也有很大区别。BeanFactory当需要调用时读取配置信息，生成某个类的实例。
		 * 如果读入的Bean配置正确，则其他的配置中有错误也不会影响程序的运行。
		 * 而ApplicationContext 在初始化时就把 xml 的配置信息读入内存，
		 * 对 XML 文件进行检验，如果配置文件没有错误，就创建所有的Bean ,直接为应用程序服务。
		 * 相对于基本的BeanFactory，ApplicationContext 唯一的不足是占用内存空间。
		 * 当应用程序配置Bean较多时，程序启动较慢。
		 * 
		 */
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
//		Resource resource=new ClassPathResource("applicationContext.xml");
//		BeanFactory factory=new XmlBeanFactory(resource);
//		FirstBean first=(FirstBean)factory.getBean("first");
//		first.printInfo();
//		FirstBean first1=(FirstBean)factory.getBean("first");
//		System.out.println(first==first1);
		
//		System.out.println("构造注入：");
//		ExampleBean example=(ExampleBean)factory.getBean("example");
//		example.showInfo();
//		
//		System.out.println("Setter注入：");
//		NewExampleBean newexample=(NewExampleBean)factory.getBean("newexample");
//		newexample.show();
		
		//student sd=(student)factory.getBean("student");
		student sd=(student)app.getBean("student");
		sd.printInfo();
	}

}
