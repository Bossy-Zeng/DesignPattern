package Adapter;
/**
 * 表示翻译，将player的信息翻译给ForeignPlayer
 * */
public class Translator extends Player {
	private ForeignPlayer foreignPlayer;

	public Translator(ForeignPlayer fPlayer) {
		this.foreignPlayer=fPlayer;
		// TODO Auto-generated constructor stub
	}
	
	
    //翻译告诉外国队员进攻
	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		foreignPlayer.Attack();
	}
    //翻译告诉外国队员防守
	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		foreignPlayer.Defense();
	}

}
