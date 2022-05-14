public class Main {

    public static void main(String[] args) {
        Runnable runnable1 = new SwingThread();
        Thread thread1 = new Thread(runnable1);
        Thread.currentThread().setPriority(9);

        Runnable runnable2 = new ShowThread();
        Thread thread2 = new Thread(runnable2);
        Runnable runnable3 = new FileThread();
        Thread thread3 = new Thread(runnable3);
        thread1.setPriority(7);
        thread2.setPriority(6);
        thread3.setPriority(5);

        thread1.run();
        thread2.run();
        thread3.run();


    }


}
