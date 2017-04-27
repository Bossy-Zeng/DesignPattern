package Factory;

/**
 * 对工厂模式进行测试
 * @author Bossy_Zeng
 *
 */
public class FactoryTest {
     public static void main(String[] args) {
		//进行测试，表示不同的运算符只需要改一行代码就行
    	 IFactory iFactory=new MolFactory();
    	 
    	 Operation operation=iFactory.CreateOperation();
    	 operation.setNumberA(103.0);
    	 operation.setNumberB(20.0);
    	 System.out.println("结果是："+operation.GetResult());
	}
}
