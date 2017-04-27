package Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 曾博晖 on 2017/3/30.
 * 对象结构类，由于总是需要‘男人’和‘女人’在不同状态的对比，
 * 所以我们需要一个‘对象结构’类来针对不同的‘状态’遍历‘男人’
 * 和‘女人’，得到不同的反应
 */
public class ObjectStructure {
    private List<Person> elements = new ArrayList<>();

    //增加
    public void Attach(Person element) {
        elements.add(element);
    }

    //移除
    public void Detach(Person element) {
        elements.remove(element);
    }

    //查看显示
    public void Display(Action visitor) {
        for (Person e : elements) {
            e.Accept(visitor);
        }
        System.out.println("\n");
    }

}
