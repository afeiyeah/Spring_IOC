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
		 * ����Spring������BeanFactory/ApplicationContext��
		 * ApplicationContext�ӿ�����BeanFactory�ӿڻ���֮�ϵģ���Ը߼�������ʵ��
		 * BeanFactoryĬ�϶���Ĭ���ӳٳ�ʼ��beanԪ��
		 * ApplicationContext�Ƿ��ӳٳ�ʼ������beanԪ��
		 * Spring�ṩ�����ֲ�ͬ��������һ�����������BeanFactory����һ������չ��ApplicationContext��
		 * BeanFactory ���ṩ�������������ע��֧�֣��� ApplicationContext ����չ��BeanFactory ,�ṩ�˸���Ķ��⹦�ܡ�
		 * ���߶�Bean�ĳ�ʼ��Ҳ�кܴ�����BeanFactory����Ҫ����ʱ��ȡ������Ϣ������ĳ�����ʵ����
		 * ��������Bean������ȷ�����������������д���Ҳ����Ӱ���������С�
		 * ��ApplicationContext �ڳ�ʼ��ʱ�Ͱ� xml ��������Ϣ�����ڴ棬
		 * �� XML �ļ����м��飬��������ļ�û�д��󣬾ʹ������е�Bean ,ֱ��ΪӦ�ó������
		 * ����ڻ�����BeanFactory��ApplicationContext Ψһ�Ĳ�����ռ���ڴ�ռ䡣
		 * ��Ӧ�ó�������Bean�϶�ʱ����������������
		 * 
		 */
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
//		Resource resource=new ClassPathResource("applicationContext.xml");
//		BeanFactory factory=new XmlBeanFactory(resource);
//		FirstBean first=(FirstBean)factory.getBean("first");
//		first.printInfo();
//		FirstBean first1=(FirstBean)factory.getBean("first");
//		System.out.println(first==first1);
		
//		System.out.println("����ע�룺");
//		ExampleBean example=(ExampleBean)factory.getBean("example");
//		example.showInfo();
//		
//		System.out.println("Setterע�룺");
//		NewExampleBean newexample=(NewExampleBean)factory.getBean("newexample");
//		newexample.show();
		
		//student sd=(student)factory.getBean("student");
		student sd=(student)app.getBean("student");
		sd.printInfo();
	}

}
