package Factory;
/**
 * ��ʾȡģ��
 * @author Bossy_Zeng
 *
 */
public class OperationMod extends Operation {

	@Override
	public double GetResult() {
		// TODO Auto-generated method stub
		if(getNumberB()!=0){
			return getNumberA()%getNumberB();
		}else {
			System.out.println("��������Ϊ0��");
			return 0;
		}
		
	}
}
