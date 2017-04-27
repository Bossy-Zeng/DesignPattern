package Factory;

/**
 * 创建除法的工厂
 * @author Bossy_Zeng
 *
 */
public class DivFactory implements IFactory {
        @Override
        public Operation CreateOperation() {
        	// TODO Auto-generated method stub
        	return new OperationDiv();
        }
}
