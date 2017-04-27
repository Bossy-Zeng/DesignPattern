package Strategy;

/**
 * 返利收费子类
 * @author 曽博晖
 *
 */
public class CashReturn extends CashSuper {
	private double moneyCondition=0.0;
	private double moneyReturn=0.0;
	
	/**
	 * @param moneyCondition 表示返利需要满足的金额
	 * @param moneyReturn 表示返利的金额
	 */
	public CashReturn(String moneyCondition,String moneyReturn) {
		this.moneyCondition=Double.parseDouble(moneyCondition);
		this.moneyReturn=Double.parseDouble(moneyReturn);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public double acceptCash(double money) {
		// TODO 自动生成的方法存根
		double result =money;
		if(money>=moneyCondition){
			result=money-Math.floor(money/moneyCondition)*moneyReturn;
		}
		return result;
	}

}
