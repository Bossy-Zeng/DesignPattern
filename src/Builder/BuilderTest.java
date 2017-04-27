package Builder;
/**
 * 对建造者模式进行测试
 * */
public class BuilderTest {
    public static void main(String[] args) {
		PersonBuilder personBuilder=new PersonBeatifulBuilder("Legend","002");
		PersonBuilderDirector pDirector=new PersonBuilderDirector(personBuilder);
		pDirector.CreatePerson();
	}
}
