package Adapter;
/**
 * ��ʾ���룬��player����Ϣ�����ForeignPlayer
 * */
public class Translator extends Player {
	private ForeignPlayer foreignPlayer;

	public Translator(ForeignPlayer fPlayer) {
		this.foreignPlayer=fPlayer;
		// TODO Auto-generated constructor stub
	}
	
	
    //������������Ա����
	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		foreignPlayer.Attack();
	}
    //������������Ա����
	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		foreignPlayer.Defense();
	}

}
