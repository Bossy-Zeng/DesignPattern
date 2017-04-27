package TemplateMethod;
/**
 * 对模板方法模式进行测试
 * */
public class TemplateMethodTest {
    public static void main(String[] args) {
		System.out.println("学生甲做的试卷");
		//将子类变量声明换成了父类，利用了多态性，实现了对代码的复用
		TestPaper testPaperA=new TestPaperA();
		testPaperA.TestQuestion1();
		testPaperA.TestQuestion2();
		testPaperA.TestQuestion3();
		
		System.out.println("\n学生乙做的试卷");
		TestPaper testPaperB=new TestPaperB();
		testPaperB.TestQuestion1();
		testPaperB.TestQuestion2();
		testPaperB.TestQuestion3();
		
	}
   
}
