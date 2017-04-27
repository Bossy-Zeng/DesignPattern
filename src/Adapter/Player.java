package Adapter;
/**
 * 适配器模式
 * 以不同国家之间球员的交流为例
 * @author 曾博晖
 * */
public abstract class Player {
  protected String nameString;
  
//  public Player(String name) {
//	// TODO Auto-generated constructor stub
//	  this.nameString=name;
//  }
  public abstract void  Attack() ;
  public abstract void  Defense() ;
}
