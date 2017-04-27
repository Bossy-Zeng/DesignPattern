package TemplateMethod;
/**
 * 对试卷类进行继承，并实际实现回答问题的细节
 * */
public class TestPaperB extends TestPaper{
	@Override
	protected String Answer1() {
		// TODO Auto-generated method stub
		return "c";
	}

	@Override
	protected String Answer2() {
		// TODO Auto-generated method stub
		return "a";
	}

	@Override
	protected String Answer3() {
		// TODO Auto-generated method stub
		return "b";
	}
}
