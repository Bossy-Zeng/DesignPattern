package TemplateMethod;
/**
 * ��ģ�巽��ģʽ���в���
 * */
public class TemplateMethodTest {
    public static void main(String[] args) {
		System.out.println("ѧ���������Ծ�");
		//������������������˸��࣬�����˶�̬�ԣ�ʵ���˶Դ���ĸ���
		TestPaper testPaperA=new TestPaperA();
		testPaperA.TestQuestion1();
		testPaperA.TestQuestion2();
		testPaperA.TestQuestion3();
		
		System.out.println("\nѧ���������Ծ�");
		TestPaper testPaperB=new TestPaperB();
		testPaperB.TestQuestion1();
		testPaperB.TestQuestion2();
		testPaperB.TestQuestion3();
		
	}
   
}
