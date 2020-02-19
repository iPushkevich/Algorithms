package by.pushkevich;

public class InsertionSort {
    public static void main(String[] args) {
        int[] m = {9, 83435, 57, 46, 5, 34, 3, 42, 1};
        sort(m);
        for (Integer i : m) {
            System.out.println(i);
        }
    }

    static void sort(int[] m) {
        for (int i = 1; i < m.length; i++) {
            int current = m[i];
            int j = i - 1;
            while (j >= 0 && current < m[j]) {
                m[j + 1] = m[j];
                j--;
            }
            m[j + 1] = current;
        }
    }
}
