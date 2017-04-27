package Builder;
/**
 * 瘦子类，继承自PersonBuilder
 * */
public class PersonThinBuilder extends PersonBuilder {

	public PersonThinBuilder(String mName, String mId) {
		super(mName, mId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void BuildHead() {
		// TODO Auto-generated method stub
		System.out.println("瓜子脸");
	}

	@Override
	public void BuildBody() {
		// TODO Auto-generated method stub
		System.out.println("瘦肚子");
	}

	@Override
	public void BuildArmLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BuildArmRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BuildLegLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BuildLegRight() {
		// TODO Auto-generated method stub
		
	}

}
