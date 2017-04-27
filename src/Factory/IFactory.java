package Factory;

/**
 * 工厂模式里面的用于创建对象的接口
 * @author Bossy_Zeng
 *
 */
public interface IFactory {
	
   /**
    * 创建实例的方法
    * @return 创建出来的运算符
    */
   Operation CreateOperation();
}
