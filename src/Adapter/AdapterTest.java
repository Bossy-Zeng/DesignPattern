package Adapter;
/**
 * ������ģʽ����
 * ������ģʽ����һ����Ľӿ�ת���ɿͻ�ϣ��������һ���ӿ�
 * */
public class AdapterTest {
	//ȫ��Ψһһ������
	private static Translator translator;
      public static void main(String[] args) {
		Player fowPlayer=new Fowards("Kobel");
		fowPlayer.Attack();
		fowPlayer.Defense();
		
	    ForeignPlayer ffpForeignPlayer=new ForeignCenter("Ҧ��");
	    //������Ҧ����������
        translator=new Translator(ffpForeignPlayer);
        translator.Attack();
        translator.Defense();
        
        ForeignPlayer ffwForeignPlayer=new ForeignFowords("�����");
        //�������������������
        translator=new Translator(ffwForeignPlayer);
        translator.Attack();
        translator.Defense();
	}
}
