class Test {
    static void printHello() {
        System.out.println("HELLO");
    }

    public void printHello2() { 
        System.out.println("HELLO2");
    }

    static void printHello3() {
        // printHello2();
        System.out.println("HELLO3");
    }

    public void printHello4() {
        printHello(); // Calling static method from public method
        printHello2();
        System.out.println("HELLO4");
    }

    public static void main(String[] args) {
        // System.out.print("Hello java");
        // printHello();
        // printHello2(); // ERRO: non-static method printHello2() cannot be referenced from a static context
        // printHello3();
        Test t = new Test();
        // t.printHello4();
    }
}

// From the static method you can't call public method but from public method you can call static method
/* 
Remember::
    public -> public (Direct possible)
    static -> static (Direct possible)
    static -> public (Direct not possible)
    public -> static (Direct possible)
*/