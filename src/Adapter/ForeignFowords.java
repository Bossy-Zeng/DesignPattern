package Adapter;
/**
 * ���ǰ��
 * */
public class ForeignFowords extends ForeignPlayer{
    

	public ForeignFowords(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("���ǰ�� "+nameString+" ����");
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("���ǰ�� "+nameString+" ����");
	}

//	@Override
//	public void setName(String nameString) {
//		// TODO Auto-generated method stub
//		this.name=nameString;
//	}
//
//	@Override
//	public String getName() {
//		// TODO Auto-generated method stub
//		return name;
//	}
	

}
