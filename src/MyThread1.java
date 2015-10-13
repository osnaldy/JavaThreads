
class MyThread1 extends Thread {
	public void run() {
		try {
				sleep(1000);
		}
		catch (InterruptedException ex) {
			ex.printStackTrace();
			//ignore the interruptedException - this is perhaps the one of the
			//very few of the exceptions in java which is acceptable to ignore
		}
		System.out.println("In run method; Thread name is: " + getName());
	}
	
	public static void main (String args []) {
		Thread myThread = new MyThread1();
		myThread.start();
		System.out.println("In the main method; thread name is: " +
				Thread.currentThread().getName());
	}

}
