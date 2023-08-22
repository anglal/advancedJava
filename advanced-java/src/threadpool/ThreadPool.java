package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	private static final int MAX_THREAD = 3;
	
	public static void main(String... args) {
		
		ExecutorService pool = Executors.newFixedThreadPool(MAX_THREAD);
		
		//Tasks
		Runnable task1 = new Task("Task - 1");
		Runnable task2 = new Task("Task - 2");
		Runnable task3 = new Task("Task - 3");
		Runnable task4 = new Task("Task - 4");
		Runnable task5 = new Task("Task - 5");
		Runnable task6 = new Task("Task - 6");
		
		pool.execute(task1);
		pool.execute(task2);
		pool.execute(task3);
		pool.execute(task4);
		pool.execute(task5);
		pool.execute(task6);
		
		pool.shutdown();
	}
}
