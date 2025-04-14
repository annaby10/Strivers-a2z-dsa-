// 1.Java Code to Find All Occurrence Indices of x in a Sorted Array:
import java.util.*;

public class OccurrenceFinder {

    // Function to find the first occurrence of x
    public static int findFirst(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                first = mid;
                high = mid - 1; // keep searching in left half
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return first;
    }

    // Function to find the last occurrence of x
    public static int findLast(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                last = mid;
                low = mid + 1; // keep searching in right half
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return last;
    }

    // Function to return all indices where x occurs
    public static List<Integer> getOccurrenceIndices(int[] arr, int x) {
        int first = findFirst(arr, x);
        int last = findLast(arr, x);

        List<Integer> result = new ArrayList<>();

        if (first == -1) return result; // x not found

        for (int i = first; i <= last; i++) {
            result.add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int x = 2;

        List<Integer> indices = getOccurrenceIndices(arr, x);

        if (indices.isEmpty()) {
            System.out.println(x + " not found in the array.");
        } else {
            System.out.println(x + " occurs at indices: " + indices);
        }
    }
}
______________________________________________________________________________________________________________________________________________________________________________

