interface Callback {
    void callback(int p);
}

class A implements Callback {
    public void callback(int p) {
        System.out.println("callback called with " + p);

    }
}

class A2 implements Callback {
    public void callback(int p) {
        System.out.println("another version of callback");
        System.out.println("squared of p is " + p * p);
    }

}

class B {
    public static void main(String args[]) {
        Callback c = new A();
        A2 a = new A2();
        c.callback(42);
        a.callback(5);

    }

}