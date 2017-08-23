package com.persistent.test;

public class ProducerConsumerTester {

	public static void main(String[] args) {
		ContentForProducerConsumer cpm = new ContentForProducerConsumer();
		Producer p1= new Producer(cpm, 1);
		Consumer c1 = new Consumer(cpm, 1);
		p1.start();
		c1.start();

	}

}
