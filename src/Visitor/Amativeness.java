package Visitor;

import Temp.OutClass;

/**
 * Created by 曾博晖 on 2017/3/30.
 * 表示恋爱这一状态
 */
public class Amativeness extends Action{
    @Override
    public void GetManConclusion(Man concreteElementA) {
        OutClass.Print(concreteElementA.getClass().getName() +
                        this.getClass().getName()+
                "时，凡事不懂也要装懂");
    }

    @Override
    public void GetWomanConclusion(WoMan concreteElementB) {
        OutClass.Print(concreteElementB.getClass().getName() +
                        this.getClass().getName()+
                "时，遇事懂也要装不懂");
    }
}
