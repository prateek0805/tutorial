interface A {
    void meth1();

    void meth2();
}

interface B2 extends A {
    void meth3();
}

class MyClass implements B2 {
    public void meth1() {
        System.out.println("Implement meth1()");
    }

    public void meth2() {
        System.out.println("Implement meth2()");

    }

    public void meth3() {
        System.out.println("Implement meth3()");
    }
}

class Extended {
    public static void main(String args[]) {
        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
