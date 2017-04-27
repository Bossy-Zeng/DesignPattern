package Proxy;
/**
 * 表示追求者类
 * 实现公用接口
 * */
public class Pursuit implements IGiveGift {
    SchoolGirl mm=new SchoolGirl();
    
    public Pursuit(SchoolGirl schoolGirl) {
		// TODO Auto-generated constructor stub
    	this.mm=schoolGirl;
	}
    
	@Override
	public void GiveDolls() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName()+" 送你洋娃娃");
	}

	@Override
	public void GiveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName()+" 送你鲜花");
	}

	@Override
	public void GiveChocolates() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName()+" 送你巧克力");
	}

}
