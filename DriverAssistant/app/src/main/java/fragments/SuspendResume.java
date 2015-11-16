package fragments;

/**
 * Created by deepankur on 13-11-2015.
 */

class NewThread implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    public NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }

        } catch (InterruptedException e) {
            System.out.println(name + "interrrupted");
        }

        System.out.println(name + "Exit");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}


public class SuspendResume {
    public static void main(String args[]) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
        //    System.out.println("suspend");
            Thread.sleep(1000);
            ob1.myresume();
            ob2.mysuspend();
            ob2.myresume();

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        try {
            ob1.t.join();
            ob2.t.join();
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}