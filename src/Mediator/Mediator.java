package Mediator;
/**
 * 抽象中介者类
 * */
public abstract class Mediator {
	/**
	 * 定义一个抽象的发送信息方法，得到同事对象和发送信息
	 * */
    public abstract void Send(String msg,Colleage colleage);
    
}
