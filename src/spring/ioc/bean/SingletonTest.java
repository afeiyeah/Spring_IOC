package spring.ioc.bean;

public class SingletonTest {
	//����˽�еĹ��췽��
	private SingletonTest(){
		
	}
	//����һ����ǰ��Ķ���
	private static SingletonTest single=new SingletonTest();
	//�ṩһ�����������������ɵ������
	public static SingletonTest getInstance(){
		return single;
	}
	
}
