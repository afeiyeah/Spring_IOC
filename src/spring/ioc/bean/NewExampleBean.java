package spring.ioc.bean;

public class NewExampleBean {
	private FirstBean firstBean;
	private SecondBean secondBean;

	public void setFirstBean(FirstBean firstBean) {
		this.firstBean = firstBean;
	}
	public void setSecondBean(SecondBean secondBean) {
		this.secondBean = secondBean;
	}
	//setter
	public void show(){
		firstBean.printInfo();
		secondBean.printInfo();
	}
}
