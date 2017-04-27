package Builder;
/**
 * ������ģʽ����ĺ���Ҫ��һ����
 * ָ����
 * ���ڿ��ƽ������
 * Ҳ�����������û��뽨����֮��Ĺ�ϵ
 * */
public class PersonBuilderDirector {
     private PersonBuilder personBuilder;
     
     public PersonBuilderDirector(PersonBuilder pBuilder) {
		// TODO Auto-generated constructor stub
    	 this.personBuilder=pBuilder;
	}
     
     public void CreatePerson() {
    	 System.out.println("������"+personBuilder.name+"\n");
    	personBuilder.BuildHead();
		personBuilder.BuildBody();
		personBuilder.BuildArmLeft();
		personBuilder.BuildArmRight();
		personBuilder.BuildLegLeft();
		personBuilder.BuildLegRight();
	}
}
