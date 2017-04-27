package Factory;
/**
 * 创建减法的工厂
 * 
 */
public class SubFactory implements IFactory {

	@Override
	public Operation CreateOperation() {
		// TODO Auto-generated method stub
		return new OperationSub();
	}

}
