package Flyweight;
/**
 * 具体网站类
 * 在享元对象内部并且不会随环境改变而改变的共享部分，被称为享元对象的内部状态。
 * 内部状态存储于ConcreteWebSite对象之中。
 * */
public class ConcreteWebSite extends WebSite {

	private String name="";
	public ConcreteWebSite(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	@Override
	public void Use(User user) {
		// TODO Auto-generated method stub
		System.out.println("网站分类："+name+" 用户: "+user.getName());
	}
	
}
