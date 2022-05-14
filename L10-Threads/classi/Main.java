public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread runnable1 = new MyThread();
        Thread threadReader = new Thread(runnable1);
        MySecondThread runnable2 = new MySecondThread();
        Thread threadWriter = new Thread(runnable2);

        threadReader.run();
        //System.out.println(threadReader.getPriority());
        threadReader.join();
        threadWriter.run();

    }
}
