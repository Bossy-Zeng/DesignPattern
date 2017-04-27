package Visitor;

/**
 * Created by 曾博晖 on 2017/3/30.
 * 状态的抽象类
 */
public abstract class Action {
    //得到男人的结论或反应
    public abstract void GetManConclusion(Man concreteElementA);
    //得到女人的结论或反应
    public abstract void GetWomanConclusion(WoMan concreteElementB);
}
