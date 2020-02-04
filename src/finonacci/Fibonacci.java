package finonacci;

/* class fibonacci
    {
        static int fib(int n)
        {
            if (n <= 1)
                return n;
            return fib(n-1) + fib(n-2);
        }

        public static void main (String args[])
        {
            int n = 9;
            System.out.println(fib(n));
        }
    }

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1;
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(a + " , ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
*/

public class Fibonacci {

    public static void main(String[] args) {
        fib(4);
    }

    static void fib(int n) {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; ++i) {
            print(a);
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    private static void print(final int a) {
        System.out.print(a + " , ");
    }
}
