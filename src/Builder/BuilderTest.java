package Builder;
/**
 * �Խ�����ģʽ���в���
 * */
public class BuilderTest {
    public static void main(String[] args) {
		PersonBuilder personBuilder=new PersonBeatifulBuilder("Legend","002");
		PersonBuilderDirector pDirector=new PersonBuilderDirector(personBuilder);
		pDirector.CreatePerson();
	}
}
