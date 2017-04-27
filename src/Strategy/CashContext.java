package Strategy;

/**
 * 策略模式和简单工厂模式结合
 * @author 曽博晖
 *
 */
public class CashContext {
	CashSuper cs=null;
	public CashContext(String type) {
		// TODO 自动生成的构造函数存根
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
	}
	public double GetResult(double money){
		return cs.acceptCash(money);
	}

}
