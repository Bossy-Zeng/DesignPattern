package ConcreteMediator;
/**
 * ���н���ģʽ���в���
 * �����Ϲ�����ᴦ��������ս��Ϊ��
 * */
public class ConcreteMediatorTest {

	public static void main(String[] args) {
		UnitedNationsSecurityCounci1 UNSC=new UnitedNationsSecurityCounci1();
		
		USA c1=new USA(UNSC);
		Iraq c2=new Iraq(UNSC);
		
		UNSC.setColleage1(c1);
		UNSC.setColleage2(c2);
		
		c1.Declare("�������з������������򷢶�ս��");
		c2.Declare("��δ���ƹ�������������Ҳ����ս��");
	}
}
