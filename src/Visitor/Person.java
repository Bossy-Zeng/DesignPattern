package Visitor;

/**
 * Created by 曾博晖 on 2017/3/30.
 * 人的抽象类
 */
public abstract class Person {
    /**
     * 接受
     * 用来获取状态对象
     * */
    public abstract void Accept(Action visitor);
}
