package Proxy;
/**
 * ¥˙¿Ì¿‡
 * */
public class Proxy implements IGiveGift {
	
	Pursuit gg;
    public Proxy(SchoolGirl schoolGirl) {
		// TODO Auto-generated constructor stub
    	gg=new Pursuit(schoolGirl);
	}
	@Override
	public void GiveDolls() {
		// TODO Auto-generated method stub
		gg.GiveDolls();
	}

	@Override
	public void GiveFlowers() {
		// TODO Auto-generated method stub
		gg.GiveFlowers();
	}

	@Override
	public void GiveChocolates() {
		// TODO Auto-generated method stub
		gg.GiveChocolates();
	}

}
