package Factory;
/**
 * �����ӷ��Ĺ���
 * 
 */
public class AddFactory implements IFactory {
   @Override
    public Operation CreateOperation() {
	// TODO Auto-generated method stub
	return new OperationAdd();
   }
}
