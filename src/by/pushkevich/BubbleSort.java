package by.pushkevich;

public class BubbleSort {
    public static void main(String[] args) {
        int[] m = {9, 83435, 57, 46, 5, 34, 3, 42, 1};
        sort(m);
        for (Integer i : m) {
            System.out.println(i);
        }
    }

    static void sort(int[] m) {
        for (int i = m.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (m[j] > m[j + 1]) {
                    int tmp = m[j + 1];
                    m[j + 1] = m[j];
                    m[j] = tmp;
                }
            }
        }
    }
}
