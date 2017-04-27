package Strategy;

/**
 * �����շ�����
 * @author ������
 *
 */
public class CashReturn extends CashSuper {
	private double moneyCondition=0.0;
	private double moneyReturn=0.0;
	
	/**
	 * @param moneyCondition ��ʾ������Ҫ����Ľ��
	 * @param moneyReturn ��ʾ�����Ľ��
	 */
	public CashReturn(String moneyCondition,String moneyReturn) {
		this.moneyCondition=Double.parseDouble(moneyCondition);
		this.moneyReturn=Double.parseDouble(moneyReturn);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public double acceptCash(double money) {
		// TODO �Զ����ɵķ������
		double result =money;
		if(money>=moneyCondition){
			result=money-Math.floor(money/moneyCondition)*moneyReturn;
		}
		return result;
	}

}
