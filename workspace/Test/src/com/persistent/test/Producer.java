package com.persistent.test;

public class Producer extends Thread{

	private ContentForProducerConsumer cpm;
	private int number;
	
	
	Producer(ContentForProducerConsumer cpm , int num){
		this.cpm = cpm;
		this.number = num;
	}
	
	public void run(){
		
		for(int i = 0; i < 10; i++){
			cpm.put(i);
			System.out.println("Producer"+number+"  "+i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
