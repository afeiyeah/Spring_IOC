package spring.ioc.service;

import spring.ioc.bean.User;
import spring.ioc.dao.UserDao;

public class UserService {
	private UserDao userdao;
	
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	public void saveUser(User u){
		userdao.saveUser(u);
	}
}
