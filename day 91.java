package pkg100days;
public class day91 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Deret Fibonacci dengan " + n + " angka:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");}}

    static int fibonacci(int n) {
        if (n <= 1) {return n;} 
        else {return fibonacci(n - 1) + fibonacci(n - 2);}}}