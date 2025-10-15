class MyThread1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1();
        MyThread1 obj2 = new MyThread1();

        Thread t1 = new Thread(obj1, "Thread A");
        Thread t2 = new Thread(obj2, "Thread B");

        t1.start();
        t2.start();
    }
}

