package controller;

public class ThreadId extends Thread {

	private long id = getId();

	public ThreadId() {

	}

	@Override
	public void run() {
		System.out.println("O id dessa thread é #" + id);
	}

}
