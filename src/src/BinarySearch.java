import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public void recursiveBinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        recursiveBinarySearch(list, key, low, high);

        Integer[] integerArray = Arrays.stream(list).boxed().toArray(Integer[]::new);
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(integerArray));
        int index = arrayList.indexOf(key);

        System.out.println(key + " is " + index + ". index of the list.");
    }

    private static int recursiveBinarySearch(int[] list, int key, int low, int high) {
        if (low < high) {
            return -low - 1;
        }
        int mid = (low + high) / 2;
        if (key < list[mid]) {
            return recursiveBinarySearch(list, key, low, mid - 1);
        } else if (key == list[mid]) {
            return mid;
        } else {
            return recursiveBinarySearch(list, key, mid + 1, high);
        }
    }
}
