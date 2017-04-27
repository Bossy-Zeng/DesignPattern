package Composite;
/**
 * 公司类 定义为抽象类或是接口
 * */
public abstract class Company {
	protected String nameString;
	public Company(String name) {
		// TODO Auto-generated constructor stub
		this.nameString=name;
	}
	public abstract void Add(Company c);//增加
	public abstract void Remove(Company c);//移除
	public abstract void Display(int depth);//显示
	public abstract void LineOfDuty();//履行责任
	
}
