package Factory;

/**
 * ��ʾ�ӷ���
 * @author Bossy_Zeng
 *
 */
public class OperationAdd extends Operation {
	
    @Override
    public double GetResult() {
    	// TODO Auto-generated method stub
    	return getNumberA()+getNumberB();
    }
}
