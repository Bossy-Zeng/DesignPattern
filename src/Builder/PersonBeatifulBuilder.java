package Builder;
/**
 * ��Ů�࣬�̳���PersonBuilder
 * */
public class PersonBeatifulBuilder extends PersonBuilder {

	public PersonBeatifulBuilder(String mName, String mId) {
		super(mName, mId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void BuildHead() {
		// TODO Auto-generated method stub
		System.out.println("�����������۾�����üë");
	}

	@Override
	public void BuildBody() {
		// TODO Auto-generated method stub
		System.out.println("����");
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
		System.out.println("ϸ����");
	}

	@Override
	public void BuildLegRight() {
		// TODO Auto-generated method stub
		
	}

}
