class MyThread extends Thread {
    public void run() {
        System.out.println("-----------------------");
    }
}

class LetterThread extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
            try {
                Thread.sleep(150); // Sleep for 500ms to simulate work
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class th {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // Create a new thread
        LetterThread t2 = new LetterThread();
        t1.start(); // Start the thread
        t2.start();

    }
}
