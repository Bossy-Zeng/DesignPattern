package Visitor;

/**
 * Created by ������ on 2017/3/30.
 * ״̬�ĳ�����
 */
public abstract class Action {
    //�õ����˵Ľ��ۻ�Ӧ
    public abstract void GetManConclusion(Man concreteElementA);
    //�õ�Ů�˵Ľ��ۻ�Ӧ
    public abstract void GetWomanConclusion(WoMan concreteElementB);
}
