package TemplateMethod;

/**
 * ģ�巽������
 * �Ծ�ĸ��࣬���Ծ��һЩ�������м��з�װ
 * @author Bossy_Zeng
 *
 */
public abstract class TestPaper {
	
	//ģ�巽���������߼��ĹǼܣ����߼����������Ӧ��һЩ���������
	//���Ƕ��Ƴٵ�����ʵ��
      public void TestQuestion1() {
		// TODO Auto-generated method stub
           System.out.println("���ǲ�����˧�ģ�a.�� b.������ c.���϶��� "+Answer1());
	}
      public void TestQuestion2() {
    	  System.out.println("���ǲ��Ǻܰ��ң�a.�� b.������ c.���϶��� "+Answer2());
	}
      public void TestQuestion3() {
    	  System.out.println("���ǲ��Ǻ�ϲ�����ģʽ��a.�� b.������ c.���϶��� "+Answer3());
	}
      //һЩ������Ϊ��Ҫ����������ʵ��
      protected abstract String Answer1() ;
      protected abstract String Answer2() ;
      protected abstract String Answer3() ;
}
