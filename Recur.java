class Recur {
    // Print numbers from n to 1.
    // static void printN(int n) {
    //     if(n==0) return;
    //     System.out.print(n + " ");
    //     printN(n-1);
    // }

    // Print numbers from 1 to n.
    // public static void printN(int n) {
    //     if(n == 0) return;
    //     printN(n-1);
    //     System.out.print(n + " ");
    // }

    // Print the sum of first n natural numbers.
    // static int printN(int n) {
    //     if (n<=1) {
    //         return n;
    //     }
    //     return n + printN(n-1);
    // }

    // Print factorial of a number n
    // static int printN(int n) {
    //     if(n <= 1) {
    //         return n;
    //     }
    //     return printN(n-1)*n;
    // }

    // Print the fibonacci sequence till nth term.
    // public static void printFactorial(int a, int b, int n) {
    //     if(n < 0) {
    //         return;
    //     }
    //     System.out.print(a + " ");
    //     printFactorial(b, a+b, n-1);
    // }

    //  Print x^n (Power)
    // static int power(int x, int n) {
    //     if(n == 0) {
    //         return 1;
    //     }
    //     return power(x, n-1) * x;
    // }

    public static void main(String[] args) {
        printN(5);
        // System.out.print(printN(5));
        // printFactorial(0, 1, 9);
        // System.out.print(power(3, 4));
    }
}