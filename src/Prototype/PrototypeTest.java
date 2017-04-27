package Prototype;
/**
 * 对原型模式进行测试
 * */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
		Resume resume1=new Resume("曽博晖");
		resume1.setPetsonalInfo("男","21");
		resume1.setWorkExperience("2014-2017", "阿里巴巴");
		resume1.Display();
		
		Resume resume2=(Resume)resume1.clone();
		resume2.setWorkExperience("2015-2016", "途牛企业");
		resume2.Display();
		
		Resume resume=(Resume)resume2.clone();
		resume.setPetsonalInfo("男","20");
		resume.setWorkExperience("2014-2018", "腾讯公司");
		resume.Display();
	}
}
