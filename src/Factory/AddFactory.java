package Factory;
/**
 * 创建加法的工厂
 * 
 */
public class AddFactory implements IFactory {
   @Override
    public Operation CreateOperation() {
	// TODO Auto-generated method stub
	return new OperationAdd();
   }
}
