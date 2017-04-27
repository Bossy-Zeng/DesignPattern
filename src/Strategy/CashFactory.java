package Strategy;

/**
 * 现金收费工厂类
 * @author 曽博晖
 *
 */
public class CashFactory {
	public static CashSuper createCashAccept(String type) {
		CashSuper cs=null;
		switch (type) {
		case "正常收费":
			cs=new CashNomal();
			break;
		case "满三百返一百":
			cs=new CashReturn("300", "100");
			break;
		case "打八折":
			cs=new CashRebate(0.8);
			break;

//		default:
//			break;
		}
		return cs;
	}

}
