package com.shirishProgramming;

public class TestThreadDemo {
public static void main(String[] args) {
	ThreadDemo t1 = new ThreadDemo("threadone");
	t1.start();
	ThreadDemo t2 = new ThreadDemo("threadtwo");
	t2.start();
}
}
