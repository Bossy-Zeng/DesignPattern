package Bridge;
/**
 * 桥接模式测试
 * 实现系统可能有多角度分类，每一种分类都可能有变化，
 * 那么就把这种多角度分离出来让它们独立变化，减少他们之间的耦合
 * */
public class BridgeTest {
    public static void main(String[] args) {
		Abstraction abstraction=new RefinedAbstraction();
		
		abstraction.setImplementor(new ConcreteImplementorA());
		abstraction.Operation();
		
		abstraction.setImplementor(new ConcreteImplementorB());
		abstraction.Operation();
	}
}
