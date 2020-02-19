package by.pushkevich;

public class MergeSort {
    public static void main(String[] args) {
        int[] m = {3, 2, 1};
        m = sort(m);
        for (Integer i : m) {
            System.out.print(i + " ");
        }

    }

    static int[] sort(int[] m) {
        if (m.length < 2) return m;
        int left = m.length / 2;
        int right = m.length - left;

        int leftArr[] = new int[left];
        int rightArr[] = new int[right];

        System.arraycopy(m, 0, leftArr, 0, left);
        System.arraycopy(m, left, rightArr, 0, right);


        return merge(sort(leftArr), sort(rightArr));
    }

    static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int resIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                result[resIndex] = left[leftIndex];
                leftIndex++;
            } else {
                result[resIndex] = right[rightIndex];
                rightIndex++;
            }
            resIndex++;
        }
        while (leftIndex < left.length) {
            result[resIndex] = left[leftIndex];
            leftIndex++;
            resIndex++;
        }
        while (rightIndex < right.length) {
            result[resIndex] = right[rightIndex];
            rightIndex++;
            resIndex++;
        }
        return result;
    }
}
