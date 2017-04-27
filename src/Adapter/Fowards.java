package Adapter;
/**
 * Ç°·æ
 * */
public class Fowards extends Player {
	private String nameString;
	public Fowards(String name) {
		this.nameString=name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("Forwards "+nameString+" Attack");
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("Forwards "+nameString+" Defense");	
	}

}
