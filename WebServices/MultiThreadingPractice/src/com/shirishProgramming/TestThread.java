package com.shirishProgramming;

public class TestThread {
	public static void main(String[] args) {
		RunnableDemo r1 = new RunnableDemo("threadOne");
		r1.start();
		RunnableDemo r2 = new RunnableDemo("threadTwo");
		r2.start();
	}

	
}
