package Strategy;

/**
 * �ֽ��շѹ�����
 * @author ������
 *
 */
public class CashFactory {
	public static CashSuper createCashAccept(String type) {
		CashSuper cs=null;
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
		return cs;
	}

}
