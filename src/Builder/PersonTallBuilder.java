package Builder;
/**
 * 高个子类，继承自PersonBuilder
 * */
public class PersonTallBuilder extends PersonBuilder {

	public PersonTallBuilder(String mName, String mId) {
		super(mName, mId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void BuildHead() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BuildBody() {
		// TODO Auto-generated method stub
		
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
		System.out.println("大长腿");
	}

	@Override
	public void BuildLegRight() {
		// TODO Auto-generated method stub
		System.out.println("大长腿");
	}

}
