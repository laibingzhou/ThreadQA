package cn.blues.lai.runnable;

import cn.blues.lai.bean.SharedData;

public class ComsumerRunnable implements Runnable{

	SharedData data;
	
	public ComsumerRunnable(SharedData data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {
		while(true){
			data.consumer();
		}
	}
}
