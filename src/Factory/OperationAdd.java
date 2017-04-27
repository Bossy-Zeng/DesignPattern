package Factory;

/**
 * 表示加法类
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
