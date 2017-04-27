package Factory;
/**
 * 表示减法类
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
