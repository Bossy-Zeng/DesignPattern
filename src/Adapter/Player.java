package Adapter;
/**
 * ������ģʽ
 * �Բ�ͬ����֮����Ա�Ľ���Ϊ��
 * @author ������
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
