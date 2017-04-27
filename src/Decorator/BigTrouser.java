package Decorator;

/**
 * 垮裤
 * 继承自服装类，相当于装饰模式里面的具体装饰对象
 * @author Bossy_Zeng
 *
 */
public class BigTrouser extends Finery {
  @Override
  public void show() {
	// TODO Auto-generated method stub
	  System.out.println("垮裤");
	  super.show();
  }
}
