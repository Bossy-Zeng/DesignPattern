package Strategy;

/**
 * �����շ�����
 * @author ������
 *
 */
public class CashRebate extends CashSuper{
	private double moneyRebate=1.0;
	
	/**
	 * TODO ��ʼ��ʱ���������ۿ��ʣ�����˵����۾�������0.8
	 * @param moneyRebate ������
	 */
	public  CashRebate(double moneyRebate) {
		// TODO �Զ����ɵĹ��캯�����
		this.moneyRebate=moneyRebate;
	}

	@Override
	public double acceptCash(double money) {
		// TODO �Զ����ɵķ������
		return money*moneyRebate;
	}

}
