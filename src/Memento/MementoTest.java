package Memento;
/**
 * ����¼ģʽ
 * �Դ洢�����Իָ���Ϸ��ɫ��״̬��һ����Ϊ��
 * @author ������
 * */
public class MementoTest {
    public static void main(String[] args) {
		GameRole gameRole=new GameRole("Jack");
		//��ȡ��ʼ״̬
		gameRole.GetInitState();
		gameRole.StateDisplay();
		
		//�������
		RoleStateCaretaker rCaretaker=new RoleStateCaretaker();
		rCaretaker.setRoleStateMemento(gameRole.SaveState());
		
		//����ս�������Ĳ���
		System.out.println("\n����ս��\n");
		gameRole.Fight();
		gameRole.StateDisplay();
		
		//�ָ�֮ǰ״̬
		System.out.println("\n�ָ�״̬\n");
		gameRole.RecoveryState(rCaretaker.getRoleStateMemento());
		gameRole.StateDisplay();
	}
}
