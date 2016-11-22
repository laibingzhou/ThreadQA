package cn.blues.lai.bean;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class SharedData {
	
	private BlockingQueue<Integer> queue=new ArrayBlockingQueue<Integer>(10);
	
	public Integer consumer(){
		try {
			Integer take = queue.take();
			System.out.println("comsumer data:"+take);
			return take;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public void produce(Integer number){
		try {
			System.out.println("produce data:"+number);
			queue.put(number);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
