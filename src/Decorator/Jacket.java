package Decorator;
/**
 * 夹克衫
 * 继承自服装类，相当于装饰模式里面的具体装饰对象
 * @author Bossy_Zeng
 *
 */
public class Jacket extends Finery {
   @Override
   public void show() {
	// TODO Auto-generated method stub
	   System.out.println("夹克衫");
	   super.show();
   }
}
