package �¼�ί��;

import java.util.Date;
/**
 * 1����������ȫ��֪������Ϸ�ߵĴ��ڣ���ȫ���
 * ����Ȼ�����͹鹦��Event��EventHandler���������������ͨ���ԣ�
 * 2����ʦ���˺���Ϸ��ֹͣ��Ϸ�ص���λ���������Źرյ��ӡ�
 * ��һ��֪ͨ��ִ���˲�ͬ��Ĳ�ͬ������
 * 3����չ�Ժܸߣ�����һ���������ѧ������д��������ѧ���࣬
 * ���ڲ��Դ����и��߷�����һ�¾ͺã���������ȫû�б䡣�����Ժ�
 * */
public class Test {
	public static void main(String[] args) {
		//����һ����ְ����ķ�����   
		Notifier goodNotifier=new GoodNotifier();   
		Notifier badNotifier=new BadNotifier();  
		//����һ������Ϸ��ͬѧ����ʼ����Ϸ   
		PlayingGameListener playingGameListener=new PlayingGameListener();   
		//����һ�������ӵ�ͬѧ����ʼ������   
		WatchingTVListener watchingTVListener=new WatchingTVListener();   
		//����Ϸ��ͬѧ���߷��ڵ�ͬѧ����ʦ���˸���һ��   
		goodNotifier.addListener(playingGameListener, "stopPlayingGame",new Date());   
		goodNotifier.addListener(playingGameListener, "beginStudying",new Date()); 
		//�����ӵ�ͬѧ���߷��ڵ�ͬѧ����ʦ���˸���һ��   
		badNotifier.addListener(watchingTVListener, "stopWatchingTV",new Date());   
		try{   
		    //һ��ʱ���   
		    Thread.sleep(1000);   
		}catch(Exception e){   
		    e.printStackTrace();   
		}   
		//��ʦ���֣����ڵ���֪ͨ����Ҫ��æ��ͬѧ:��ʦ����   
		goodNotifier.notifyX(); 
		badNotifier.notifyX();
	} 
}
