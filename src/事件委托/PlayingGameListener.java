package �¼�ί��;

import java.util.Date;

/**
 * ����Ϸ��ѧ����PlayingGameListener
 * */
public class PlayingGameListener {
	public PlayingGameListener(){   
        System.out.println("����������Ϸ ��ʼʱ��"+new Date());   
    }   
    public void stopPlayingGame(Date date){   
        System.out.println("��ʦ���ˣ���ص���λ�ϣ�����ʱ��"+date);   
    }   
    public void beginStudying(Date date) {
		System.out.println("��װ��ʼѧϰ"+date);
	}
}
