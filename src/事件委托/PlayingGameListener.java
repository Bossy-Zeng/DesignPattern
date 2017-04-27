package 事件委托;

import java.util.Date;

/**
 * 玩游戏的学生：PlayingGameListener
 * */
public class PlayingGameListener {
	public PlayingGameListener(){   
        System.out.println("我正在玩游戏 开始时间"+new Date());   
    }   
    public void stopPlayingGame(Date date){   
        System.out.println("老师来了，快回到座位上，结束时间"+date);   
    }   
    public void beginStudying(Date date) {
		System.out.println("假装开始学习"+date);
	}
}
