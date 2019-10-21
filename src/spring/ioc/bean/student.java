package spring.ioc.bean;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class student {
	//注意：类中成员变量的名称中，前两个字母不能有大写字母
	private int sid;
	private String sname;
	private String address;
	private Date date;
	private Set<Course> courses;
	private Map<String,Integer> scores;
	private String[] phones;
	
	public void setScores(Map<String, Integer> scores) {
		this.scores = scores;
	}
	
	public void setPhones(String[] phones) {
		this.phones = phones;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void printInfo(){
		System.out.println(sid+" "+sname+" "+address+" "+date);
		Iterator<Course> ite=courses.iterator();
		while(ite.hasNext()){
			Course c=ite.next();
			System.out.println(c.getCid()+" "+c.getCname());
		}
		Set<String> set=scores.keySet();
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()){
			String key=iter.next();
			Integer value=scores.get(key);
			System.out.println(key+" "+value);
		}
		for(String str:phones){
			System.out.println(str);
		}
		
	}
}
