package 事件委托;

import java.util.Date;

public class WatchingTVListener {
	public WatchingTVListener(){   
        System.out.println("我正在看电视 "+new Date());   
    }   
    public void stopWatchingTV(Date date){   
        System.out.println("老师来了，快关闭电视 。 结束时间"+date);   
    }   
}
