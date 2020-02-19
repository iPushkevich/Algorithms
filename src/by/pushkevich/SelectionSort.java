package by.pushkevich;

public class SelectionSort {
    public static void main(String[] args) {
        int[] m = {9, 83435, 57, 46, 5, 34, 3, 42, 1};
        sort(m);
        for (Integer i : m) {
            System.out.println(i);
        }

    }

    static void sort(int[] m) {
        for (int i = 0; i < m.length; i++) {
            int min = m[i];
            int index = i;
            for (int j = i + 1; j < m.length; j++) {
                if (m[j] < min) {
                    min = m[j];
                    index = j;
                }
            }
            int tmp = m[i];
            m[i] = min;
            m[index] = tmp;
        }
    }
}
