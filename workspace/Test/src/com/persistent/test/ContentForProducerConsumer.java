package com.persistent.test;

public class ContentForProducerConsumer {
	
	private int contents;
	private boolean availableflag =false;
	
	public synchronized int get(){
		while(availableflag == false){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		availableflag = false;
		notifyAll();
		return contents;
	}
	
	public synchronized void put(int contentsVal){
		
		while(availableflag == true){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		contents=contentsVal;
		availableflag = true;
		notifyAll();
	}

}
