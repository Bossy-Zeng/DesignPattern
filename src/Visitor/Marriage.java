package Visitor;

import Temp.OutClass;

/**
 * Created by 曾博晖 on 2017/3/30.
 * 表示结婚这一状态
 */
public class Marriage extends Action{
    @Override
    public void GetManConclusion(Man concreteElementA) {
        OutClass.Print(concreteElementA.getClass().getName() +
                this.getClass().getName()
                + "时，感慨道：恋爱游戏终结时，‘有妻徒刑遥遥无期’");
    }

    @Override
    public void GetWomanConclusion(WoMan concreteElementB) {
        OutClass.Print(concreteElementB.getClass().getName() +
                this.getClass().getName()
                +"时，欣慰道：爱情长跑路漫漫，婚姻保险保平安");
    }
}
