package Visitor;

import Temp.OutClass;

/**
 * Created by ������ on 2017/3/30.
 * ��ʾ������һ״̬
 */
public class Amativeness extends Action{
    @Override
    public void GetManConclusion(Man concreteElementA) {
        OutClass.Print(concreteElementA.getClass().getName() +
                        this.getClass().getName()+
                "ʱ�����²���ҲҪװ��");
    }

    @Override
    public void GetWomanConclusion(WoMan concreteElementB) {
        OutClass.Print(concreteElementB.getClass().getName() +
                        this.getClass().getName()+
                "ʱ�����¶�ҲҪװ����");
    }
}
