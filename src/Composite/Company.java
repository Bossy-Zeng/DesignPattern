package Composite;
/**
 * ��˾�� ����Ϊ��������ǽӿ�
 * */
public abstract class Company {
	protected String nameString;
	public Company(String name) {
		// TODO Auto-generated constructor stub
		this.nameString=name;
	}
	public abstract void Add(Company c);//����
	public abstract void Remove(Company c);//�Ƴ�
	public abstract void Display(int depth);//��ʾ
	public abstract void LineOfDuty();//��������
	
}
