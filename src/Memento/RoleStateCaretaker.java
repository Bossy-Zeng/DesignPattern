package Memento;
/**
 * 角色状态管理者
 * @author 曾博晖
 * */
public class RoleStateCaretaker {
  private RoleStateMemento roleStateMemento;
  public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
	this.roleStateMemento = roleStateMemento;
}
  public RoleStateMemento getRoleStateMemento() {
	return roleStateMemento;
}
 
}
