package free.txt.view;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LambdaEg {

	public static void main(String[] args) {
		/*
		Runnable r = new MyaskThread();
		Thread thread = new Thread(r);
		thread.start();
*/
		/*
		Runnable r = () -> {
			Task task = new Task();
			task.connect();
		};
			Thread t1 = new Thread(r);
	        t1.start();
	        */
		
		
		/*
		 new Thread(() -> {
			new Task().connect();
		}).start();
	
		new Thread( new Task()::connect).start();
	}
	*/
		          user u1 = new user(11,"murali","murali@gmail.com"); 
		          user u2 = new user(12,"deva","deva@gmail.com"); 
		          user u3 = new user(13,"prabha","prabha@gmail.com");				 
				  List<user> li = new ArrayList<user>(); 
				  li.add(u1); 
				  li.add(u2);
				  li.add(u3);
				  System.out.println("User List :" + li);				 
				  Iterator<user> i = li.iterator();
				  while (i.hasNext()) {
				  System.out.println(i.next());				 
				  }
}
}
