package Bridge;
/**
 * �Ž�ģʽ����
 * ʵ��ϵͳ�����ж�Ƕȷ��࣬ÿһ�ַ��඼�����б仯��
 * ��ô�Ͱ����ֶ�Ƕȷ�����������Ƕ����仯����������֮������
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
