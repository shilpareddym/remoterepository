package com.persistent.test;

public class Consumer extends Thread{
	
	private ContentForProducerConsumer cpm;
	private int number;
	
	Consumer(ContentForProducerConsumer cpm, int number){
		this.cpm = cpm;
		this.number =number;
		
	}
	
	
	public void run(){
		int consumedValue;
		for(int i =0; i < 10; i++){
			consumedValue= cpm.get();
			System.out.println("Consumer"+number+"   "+consumedValue);
		}
	}
	

}
