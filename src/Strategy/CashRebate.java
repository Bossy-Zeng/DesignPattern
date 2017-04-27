package Strategy;

/**
 * 打折收费子类
 * @author 曽博晖
 *
 */
public class CashRebate extends CashSuper{
	private double moneyRebate=1.0;
	
	/**
	 * TODO 初始化时必须输入折扣率，比如说打八折就是输入0.8
	 * @param moneyRebate 打折率
	 */
	public  CashRebate(double moneyRebate) {
		// TODO 自动生成的构造函数存根
		this.moneyRebate=moneyRebate;
	}

	@Override
	public double acceptCash(double money) {
		// TODO 自动生成的方法存根
		return money*moneyRebate;
	}

}
