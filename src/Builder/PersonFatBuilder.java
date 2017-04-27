package Builder;
/**
 * ÅÖ×ÓÀà£¬¼Ì³Ð×ÔPersonBuilder
 * */
public class PersonFatBuilder extends PersonBuilder{

	public PersonFatBuilder(String mName, String mId) {
		super(mName, mId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void BuildHead() {
		// TODO Auto-generated method stub
		System.out.println("Ë«ÏÂ°Í");
	}

	@Override
	public void BuildBody() {
		// TODO Auto-generated method stub
		System.out.println("Æ¡¾Æ¶Ç");
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
