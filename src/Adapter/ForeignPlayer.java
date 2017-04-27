package Adapter;
/**
 * 表示外国球员
 * */
public abstract class ForeignPlayer {
	
	
//	public abstract void setName(String nameString) ;
//	public abstract String getName() ;
	
	protected String nameString;
	
	public ForeignPlayer(String name) {
		// TODO Auto-generated constructor stub
		this.nameString=name;
	}
	
	public abstract void  Attack() ;
	public abstract void  Defense() ;
}
