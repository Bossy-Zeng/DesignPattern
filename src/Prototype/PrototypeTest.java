package Prototype;
/**
 * ��ԭ��ģʽ���в���
 * */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
		Resume resume1=new Resume("������");
		resume1.setPetsonalInfo("��","21");
		resume1.setWorkExperience("2014-2017", "����Ͱ�");
		resume1.Display();
		
		Resume resume2=(Resume)resume1.clone();
		resume2.setWorkExperience("2015-2016", ";ţ��ҵ");
		resume2.Display();
		
		Resume resume=(Resume)resume2.clone();
		resume.setPetsonalInfo("��","20");
		resume.setWorkExperience("2014-2018", "��Ѷ��˾");
		resume.Display();
	}
}
