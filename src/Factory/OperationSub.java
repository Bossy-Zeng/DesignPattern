package Factory;
/**
 * ��ʾ������
 * @author Bossy_Zeng
 *
 */
public class OperationSub extends Operation {

	@Override
	public double GetResult() {
		// TODO Auto-generated method stub
		return getNumberA()-getNumberB();
	}

}
