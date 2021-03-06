package by.pushkevich;

public class Euclidean {
    public static int gcd(int a, int b)
    {
        if (b==0) return a;
        int c = a % b;
        return gcd(b,c);
    }

    public static void main(String[] args) {
        System.out.println(gcd(10, 3));
    }
}
