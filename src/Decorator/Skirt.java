package Decorator;
/**
 * 连衣裙
 * 继承自服装类，相当于装饰模式里面的具体装饰对象
 * @author Bossy_Zeng
 *
 */
public class Skirt extends Finery{
    @Override
    public void show() {
    	// TODO Auto-generated method stub
    	System.out.println("连衣裙");
    	super.show();
    }
}
