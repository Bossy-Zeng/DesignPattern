package Visitor;

import Temp.OutClass;

/**
 * Created by 曾博晖 on 2017/3/30.
 * 表示成功这一状态
 */
public class Success extends Action {
    @Override
    public void GetManConclusion(Man concreteElementA) {
        OutClass.Print(concreteElementA.getClass().getName() +
                this.getClass().getName()
                + "时，背后多半有一个伟大的女人");
    }

    @Override
    public void GetWomanConclusion(WoMan concreteElementB) {
        OutClass.Print(concreteElementB.getClass().getName() +
                        this.getClass().getName()
                +"时，背后大多有一个不成功的男人");
    }
}
