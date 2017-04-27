package Visitor;

/**
 * Created by 曾博晖 on 2017/3/30.
 * 访问者模式测试
 * 该模式表示一个作用于某对象结构中各个元素的操作。
 * 它是你可以在不改变各元素类的亲啊提下定义作用于
 * 各元素的新操作
 *
 * 其适用于数据结构相对稳定，又有易于变化的算法的系统。
 */
public class VisitorTest {
    public static void main(String[] agrs) {
        ObjectStructure o = new ObjectStructure();
        //在对象结构中加入要对比的男人和女人
        o.Attach(new Man());
        o.Attach(new WoMan());

        //成功时的反应
        Action a1 = new Success();
        o.Display(a1);

        //恋爱时的反应
        Action a2 = new Amativeness();
        o.Display(a2);

        //结婚时的反应,另外加一个结婚类，但不需要更改其他代码，完美体现了开放-封闭原则
        Action a3=new Marriage();
        o.Display(a3);

    }
}
