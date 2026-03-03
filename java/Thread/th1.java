class Number extends Thread {
    public void run() {
        for (int i = 1; i <= 26; i++) {
            System.out.print(i);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Number1 extends Thread {
    public void run() {
        for (int i = 1; i <= 26; i++) {
            System.out.print("_");
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class th1 {
    public static void main(String[] args) {
        Number t1 = new Number();
        Number1 t3 = new Number1();
        LetterThread t2 = new LetterThread();
        t1.start();
        t2.start();
        t3.start();

    }
}
