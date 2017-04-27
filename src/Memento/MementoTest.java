package Memento;
/**
 * 备忘录模式
 * 以存储并可以恢复游戏角色的状态这一场景为例
 * @author 曾博晖
 * */
public class MementoTest {
    public static void main(String[] args) {
		GameRole gameRole=new GameRole("Jack");
		//获取初始状态
		gameRole.GetInitState();
		gameRole.StateDisplay();
		
		//保存进度
		RoleStateCaretaker rCaretaker=new RoleStateCaretaker();
		rCaretaker.setRoleStateMemento(gameRole.SaveState());
		
		//进行战斗，消耗惨重
		System.out.println("\n进行战斗\n");
		gameRole.Fight();
		gameRole.StateDisplay();
		
		//恢复之前状态
		System.out.println("\n恢复状态\n");
		gameRole.RecoveryState(rCaretaker.getRoleStateMemento());
		gameRole.StateDisplay();
	}
}
