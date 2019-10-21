package spring.ioc.bean;

public class ExampleBean {
	//在ExampleBean中使用FirstBean的对象
	private FirstBean firstBean;
	private SecondBean secondBean;
	public ExampleBean(FirstBean firstBean,SecondBean secondBean){
		//当前类的成员变量=传入参数
		this.firstBean=firstBean;
		this.secondBean=secondBean;
	}
	public void showInfo(){
		//构造注入 
		firstBean.printInfo();
		secondBean.printInfo();
	}

}
