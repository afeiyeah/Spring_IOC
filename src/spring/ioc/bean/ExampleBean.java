package spring.ioc.bean;

public class ExampleBean {
	//��ExampleBean��ʹ��FirstBean�Ķ���
	private FirstBean firstBean;
	private SecondBean secondBean;
	public ExampleBean(FirstBean firstBean,SecondBean secondBean){
		//��ǰ��ĳ�Ա����=�������
		this.firstBean=firstBean;
		this.secondBean=secondBean;
	}
	public void showInfo(){
		//����ע�� 
		firstBean.printInfo();
		secondBean.printInfo();
	}

}
