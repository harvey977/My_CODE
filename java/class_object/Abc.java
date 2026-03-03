interface Sum {
    void add(int a, int b);
}

class C implements Sum {
    public void add(int a, int b) {
        int s = a + b;
        System.out.println("Sum = " + s);
    }
}

class S {
    public void add(int b) {
        for (int a = 1; a <= b; a++) {
            System.out.print("#");
        }
        System.out.println();
    }
}

public class Abc {
    public static void main(String[] args) {
        C o = new C();
        o.add(10, 20);

        S y = new S();
        y.add(15);
    }
}
