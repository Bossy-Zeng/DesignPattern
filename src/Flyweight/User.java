package Flyweight;
/**
 * 表示网站的用户 
 * 随环境改变而改变的、不可以共享的状态就是外部状态，此处网站的用户就是表示其的外部状态
 * */
public class User {
     private String name;
     public User(String name) {
		// TODO Auto-generated constructor stub
    	 this.name=name;
	}
     public String getName() {
		return name;
	}
}
