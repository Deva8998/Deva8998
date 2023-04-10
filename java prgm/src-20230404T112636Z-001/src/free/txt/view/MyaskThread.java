package free.txt.view;

public class MyaskThread implements Runnable {
	public void run() {
		Task t = new Task();
			t.connect();
	}
}
