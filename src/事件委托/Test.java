package 事件委托;

import java.util.Date;
/**
 * 1、放哨者完全不知道做游戏者的存在，完全解耦。
 * （当然，功劳归功于Event和EventHandler，且这两个类具有通用性）
 * 2、老师来了后游戏者停止游戏回到座位，看电视着关闭电视。
 * （一次通知，执行了不同类的不同方法）
 * 3、扩展性很高，再来一个打篮球的学生就先写个打篮球学生类，
 * 并在测试代码中告诉放哨者一下就好，放哨者完全没有变。重用性好
 * */
public class Test {
	public static void main(String[] args) {
		//创建一个尽职尽责的放哨者   
		Notifier goodNotifier=new GoodNotifier();   
		Notifier badNotifier=new BadNotifier();  
		//创建一个玩游戏的同学，开始玩游戏   
		PlayingGameListener playingGameListener=new PlayingGameListener();   
		//创建一个看电视的同学，开始看电视   
		WatchingTVListener watchingTVListener=new WatchingTVListener();   
		//玩游戏的同学告诉放哨的同学，老师来了告诉一下   
		goodNotifier.addListener(playingGameListener, "stopPlayingGame",new Date());   
		goodNotifier.addListener(playingGameListener, "beginStudying",new Date()); 
		//看电视的同学告诉放哨的同学，老师来了告诉一下   
		badNotifier.addListener(watchingTVListener, "stopWatchingTV",new Date());   
		try{   
		    //一点时间后   
		    Thread.sleep(1000);   
		}catch(Exception e){   
		    e.printStackTrace();   
		}   
		//老师出现，放哨的人通知所有要帮忙的同学:老师来了   
		goodNotifier.notifyX(); 
		badNotifier.notifyX();
	} 
}
