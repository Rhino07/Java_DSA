
public class Searching {

    public static int search(int arr[], int si, int ei, int tar) {
        if (si > ei) {
            return -1;
        }
        int mid = (ei + si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, si, mid - 1, tar);
            } else {
                return search(arr, mid + 1, ei, tar);
            }
        } else {
            if (arr[ei] >= tar && tar >= arr[mid]) {
                return search(arr, mid + 1, ei, tar);

            } else {
                return search(arr, si, mid - 1, tar);

            }
        }
    }

    public static int ForSearch(int arr[], int si, int ei, int tar) {
        while (si <= ei) {
            int mid = (si + ei) / 2;

            if (arr[mid] == tar) {
                return mid;
            }

            // Check if left half is sorted
            if (arr[si] <= arr[mid]) {
                if (arr[si] <= tar && tar < arr[mid]) {
                    ei = mid - 1; // search left
                } else {
                    si = mid + 1; // search right
                }
            } else { // right half is sorted
                if (arr[mid] < tar && tar <= arr[ei]) {
                    si = mid + 1; // search right
                } else {
                    ei = mid - 1; // search left
                }
            }
        }
        return -1; // not found

    }

    public static void main(String[] args) {

        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(ForSearch(arr, 0, arr.length, 2));
    }
}
