package Adapter;
/**
 * ����������Ա
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
    	 System.out.println("����з� "+nameString+" ����");
	}
     public void Defense() {
    	 System.out.println("����з� "+nameString+" ����");
	}
      
}
