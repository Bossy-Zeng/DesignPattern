package TemplateMethod;
/**
 * 对试卷类进行继承，并实际实现回答问题的细节
 * */
public class TestPaperA extends TestPaper{
	

	@Override
	protected String Answer1() {
		// TODO Auto-generated method stub
		return "a";
	}

	@Override
	protected String Answer2() {
		// TODO Auto-generated method stub
		return "b";
	}

	@Override
	protected String Answer3() {
		// TODO Auto-generated method stub
		return "c";
	}

}
