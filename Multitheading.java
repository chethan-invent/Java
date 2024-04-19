
public class Multitheading {

		// If Tasks can be run in parallel
		// 1) extend Thread class
		// 2) implement runnable
		 public static void main(String[] args) {
			System.out.println("Main Thread Start-->"+ Thread.currentThread().getName());
			Thread thread0 = new MyThread();
			thread0.start();
			Thread thread1 = new MyThread();
			thread1.start();
			System.out.println("Main Thread End-->"+ Thread.currentThread().getName());
			//Task -- T1
			//Task -- T2
	}
}
class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"-->Start");
		for (int i = 0; i < 5; i++) {
			System.out.println("Writing homework -->"+Thread.currentThread().getName()+"   i="+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"-->End");
	}
}