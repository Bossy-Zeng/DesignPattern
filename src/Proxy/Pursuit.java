package Proxy;
/**
 * ��ʾ׷������
 * ʵ�ֹ��ýӿ�
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
		System.out.println(mm.getName()+" ����������");
	}

	@Override
	public void GiveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName()+" �����ʻ�");
	}

	@Override
	public void GiveChocolates() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName()+" �����ɿ���");
	}

}
