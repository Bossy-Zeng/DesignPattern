package Visitor;

/**
 * Created by 曾博晖 on 2017/3/30.
 * 男人类
 */
public class Man extends Person {
    /**
     * 首先在客户程序中将具体状态作为参数传递给“男人”类完成一次分派
     * 然后“男人”类调用作为参数的“具体状态”中的方法“男人反应”，同时
     * 将自己（this）作为参数传递进去。这边完成了第二次的分配
     * */
    @Override
    public void Accept(Action visitor) {
        visitor.GetManConclusion(this);
    }
}
