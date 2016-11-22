package cn.blues.lai.main;

import cn.blues.lai.bean.SharedData;
import cn.blues.lai.runnable.ComsumerRunnable;
import cn.blues.lai.runnable.ProducerRunnable;

public class ConsumerAndProducer {
	
	public static void main(String[] args) {
		SharedData data=new SharedData();
		new Thread(new ComsumerRunnable(data)).start();
		new Thread(new ProducerRunnable(data)).start();
		
	}

}
