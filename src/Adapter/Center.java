package Adapter;
/**
 * ÖÐ·æ
 * */
public class Center extends Player {
    private String nameString;
	public Center(String name) {
		this.nameString=name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("Center "+nameString+" Attack");
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("Center "+nameString+" Defense");
	}
   
}
