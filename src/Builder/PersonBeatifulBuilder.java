package Builder;
/**
 * 美女类，继承自PersonBuilder
 * */
public class PersonBeatifulBuilder extends PersonBuilder {

	public PersonBeatifulBuilder(String mName, String mId) {
		super(mName, mId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void BuildHead() {
		// TODO Auto-generated method stub
		System.out.println("瓜子脸，大眼睛，弯眉毛");
	}

	@Override
	public void BuildBody() {
		// TODO Auto-generated method stub
		System.out.println("苗条");
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
		System.out.println("细长腿");
	}

	@Override
	public void BuildLegRight() {
		// TODO Auto-generated method stub
		
	}

}
