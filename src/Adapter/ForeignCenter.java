package Adapter;
/**
 * 代表国外的球员
 * */
public class ForeignCenter extends ForeignPlayer {
	
      public ForeignCenter(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
//	private String name;
//      
//      public void setName(String name) {
//		this.name = name;
//	}
//      public String getName() {
//		return name;
//	}
     public void Attack() {
    	 System.out.println("外国中锋 "+nameString+" 进攻");
	}
     public void Defense() {
    	 System.out.println("外国中锋 "+nameString+" 防守");
	}
      
}
