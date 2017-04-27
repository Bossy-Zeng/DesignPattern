package Factory;

/**
 * 创建乘法的工厂
 * @author Bossy_Zeng
 *
 */
public class MulFactory implements IFactory {

	@Override
	public Operation CreateOperation() {
		// TODO Auto-generated method stub
		return new OperationMul();
	}

}
