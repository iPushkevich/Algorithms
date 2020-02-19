package by.pushkevich;

public class BinarySearch {
    public static int binarySearch(int[] mass, int key ){
        int low = 0;
        int high = mass.length-1;

        while (low<=high){
            int mid = low + (high - low)/2;

            if (key < mass[mid]){
                high = mid - 1;
            }
            else if (key > mass[mid]){
                low = mid + 1;
            }
            else return mid;
        }
        return -1; //Not found
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {1,2,2,3,4,5,6,3,23}, 12));
    }

}
