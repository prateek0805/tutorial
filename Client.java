interface Callback {
    void callback(int x);
}

class Client implements Callback {
    public void callback(int p) {
        System.out.println("callback with" + p);
    }

    public static void main(String args[]) {
        Callback c = new Client();
        c.callback(42);
    }
}