package Factory;
/**
 * ����ȡģ�Ĺ���
 * @author Bossy_Zeng
 *
 */
public class MolFactory implements IFactory {

	@Override
	public Operation CreateOperation() {
		// TODO Auto-generated method stub
		return new OperationMod();
	}

}
