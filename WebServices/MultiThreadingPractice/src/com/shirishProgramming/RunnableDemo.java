package com.shirishProgramming;

public class RunnableDemo implements Runnable {
private Thread t;
private String threadName;

RunnableDemo(String name){
	this.threadName = name;
	System.out.println("creating a thread with name" + name);
}
	@Override
	public void run() {
		for(int i=0;i<3;i++){
			System.out.println("thread" + threadName);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("exiting thread" + threadName);
	}
	
	public void start(){
		if(t==null){
			t = new Thread(this, threadName);
			t.start();
		}
	}
	


}
