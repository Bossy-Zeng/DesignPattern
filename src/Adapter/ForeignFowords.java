package Adapter;
/**
 * 外国前锋
 * */
public class ForeignFowords extends ForeignPlayer{
    

	public ForeignFowords(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("外国前锋 "+nameString+" 进攻");
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("外国前锋 "+nameString+" 防守");
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
