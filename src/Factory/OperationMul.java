package Factory;
/**
 * 表示乘法类
 * @author Bossy_Zeng
 *
 */
public class OperationMul extends Operation{

	@Override
	public double GetResult() {
		// TODO Auto-generated method stub
		return getNumberA()*getNumberB();
	}

}
