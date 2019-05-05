package multiThreading;

import java.lang.Thread;

class rabbit extends Thread{
	public void run(){
		for(int i = 1; i < 100; i++){
			System.out.println("Rabit :-" + i);
		}
	}
}

class tortoise implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i < 100; i++){
			System.out.println("Tortoise :-" + i);
		}
	}	
}

public class multiThreading_test {
	public static void main(String[] args) {
		rabbit newRabbit = new rabbit();
		tortoise newTortoise = new tortoise();
		Thread newThread = new Thread(newTortoise);
		newRabbit.start();
		newThread.start();
	}
}
