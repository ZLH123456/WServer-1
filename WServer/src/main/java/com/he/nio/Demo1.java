package com.he.nio;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		ThreadDemo1 threadDemo = new ThreadDemo1();
		Thread thread1 = new Thread(threadDemo);
		thread1.start();
		Thread.sleep(20);
		
		threadDemo.setLoop(false);
	}
}

class ThreadDemo implements Runnable{
	int sum = 0;
	public void run() {
		for(int i=0;i<5;i++){
			sum = sum + 1;
			System.out.println(Thread.currentThread().getName() + " - " + sum);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public int getSum(){
		return sum;
	}
	
}

class ThreadDemo1 implements Runnable{
	boolean loop = true;
	public void run() {
		while(loop){
			System.out.println("loop running....");
		}
	}
	public void setLoop(boolean loop){
		this.loop = loop;
	}
}
