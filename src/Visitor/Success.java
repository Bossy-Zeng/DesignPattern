package Visitor;

import Temp.OutClass;

/**
 * Created by ������ on 2017/3/30.
 * ��ʾ�ɹ���һ״̬
 */
public class Success extends Action {
    @Override
    public void GetManConclusion(Man concreteElementA) {
        OutClass.Print(concreteElementA.getClass().getName() +
                this.getClass().getName()
                + "ʱ����������һ��ΰ���Ů��");
    }

    @Override
    public void GetWomanConclusion(WoMan concreteElementB) {
        OutClass.Print(concreteElementB.getClass().getName() +
                        this.getClass().getName()
                +"ʱ����������һ�����ɹ�������");
    }
}
