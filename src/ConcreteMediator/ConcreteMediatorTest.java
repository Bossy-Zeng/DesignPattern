package ConcreteMediator;
/**
 * 对中介者模式进行测试
 * 以联合国安理会处理伊拉克战争为例
 * */
public class ConcreteMediatorTest {

	public static void main(String[] args) {
		UnitedNationsSecurityCounci1 UNSC=new UnitedNationsSecurityCounci1();
		
		USA c1=new USA(UNSC);
		Iraq c2=new Iraq(UNSC);
		
		UNSC.setColleage1(c1);
		UNSC.setColleage2(c2);
		
		c1.Declare("不允许研发核武器，否则发动战争");
		c2.Declare("从未研制过核武器，我们也不惧战争");
	}
}
