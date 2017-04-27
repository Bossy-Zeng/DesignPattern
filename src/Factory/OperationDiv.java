package Factory;
/**
 * 表示除法类
 * @author Bossy_Zeng
 *
 */
public class OperationDiv extends Operation {

	@Override
	public double GetResult() {
		// TODO Auto-generated method stub
		if(getNumberB()!=0){
			return getNumberA()/getNumberB();
		}else {
			System.out.println("除数不能为0！");
			return 0;
		}
		
	}

}
