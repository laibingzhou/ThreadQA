package cn.blues.lai.runnable;

import cn.blues.lai.bean.SharedData;

public class ProducerRunnable implements Runnable{
	
	SharedData data;
	
	public ProducerRunnable(SharedData data) {
		super();
		this.data = data;
	}


	@Override
	public void run() {
		for(int i=0;i<100;i++){
			data.produce(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
