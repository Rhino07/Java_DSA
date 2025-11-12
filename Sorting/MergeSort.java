
public class MergeSort {

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, ei, mid);
    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int k = 0;
        int x = si;

        int j = mid + 1;
        while (si <= mid && j <= ei) {
            if (arr[si] <= arr[j]) {
                temp[k++] = arr[si++];

            } else {
                temp[k++] = arr[j++];
            }
        }
        while (si <= mid) {
            temp[k++] = arr[si++];

        }
        while (j <= ei) {
            temp[k++] = arr[j++];

        }
        for (k = 0; k < temp.length; k++) {
            arr[x++] = temp[k];
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 8, 9, 4};
        mergeSort(arr, 0, arr.length - 1);
        print(arr);
    }
}
