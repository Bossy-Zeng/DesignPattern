package Factory;

/**
 * �Թ���ģʽ���в���
 * @author Bossy_Zeng
 *
 */
public class FactoryTest {
     public static void main(String[] args) {
		//���в��ԣ���ʾ��ͬ�������ֻ��Ҫ��һ�д������
    	 IFactory iFactory=new MolFactory();
    	 
    	 Operation operation=iFactory.CreateOperation();
    	 operation.setNumberA(103.0);
    	 operation.setNumberB(20.0);
    	 System.out.println("����ǣ�"+operation.GetResult());
	}
}
