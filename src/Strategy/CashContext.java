package Strategy;

/**
 * ����ģʽ�ͼ򵥹���ģʽ���
 * @author ������
 *
 */
public class CashContext {
	CashSuper cs=null;
	public CashContext(String type) {
		// TODO �Զ����ɵĹ��캯�����
		switch (type) {
		case "�����շ�":
			cs=new CashNomal();
			break;
		case "�����ٷ�һ��":
			cs=new CashReturn("300", "100");
			break;
		case "�����":
			cs=new CashRebate(0.8);
			break;

//		default:
//			break;
		}
	}
	public double GetResult(double money){
		return cs.acceptCash(money);
	}

}
