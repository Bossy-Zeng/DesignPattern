package Mediator;
/**
 * �н���ģʽ����
 * */
public class MediatorTest {
      public static void main(String[] args) {
		ConcreteMediator mediator=new ConcreteMediator();
		//����������ͬ������ʶ�н��߶���
		ConcreteColleage1 colleage1=new ConcreteColleage1(mediator);
		ConcreteColleage2 colleage2=new ConcreteColleage2(mediator);
		
		//���н��߶�����ʶ��������ͬ�¶���
		mediator.setConcreteColleage1(colleage1);
		mediator.setConcreteColleage2(colleage2);
		
		//����ͬ�¶�������Ϣ����ͨ���н��߶���
		colleage1.Send("Bug�ĵ���ô���ˣ�");
		colleage2.Send("���ڸģ����ǽ���Ҫ�Ӱ��~");
	}
}
