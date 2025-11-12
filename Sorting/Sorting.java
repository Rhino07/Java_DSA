
public class Sorting {

    void BubbleSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {//< for descending

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swap++;
                }
            }
            if (swap == 0) {
                System.out.println("Best Case");
                break;
            }
        }
    }

    void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }

    void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {//increasing order, < for decreasing
                    min = j;
                }

            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {//finding position
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr; //Inserting
        }
    }

    void countSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) { // Determining the size of the count array by finding max element in the array
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;//placing the value of element in arr into count array whose index is equal to the value of arr[i], eg:-arr[0]=1 then 1 will be stored at count[1], with eac repitition the count will increase.
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {//checks if the given index is empty or not if empty moves to next index of count. #NOTE:- Here each index of count represents the frequency of the value present in the 
                arr[j] = i;//inserts into j'th index of arr
                j++;// move to next empty index to fill the array
                count[i]--;// reduce the freq count

            }
        }
    }

    public static void main(String[] args) {
        Sorting s = new Sorting();

        int arr[] = {2, 5, 1, 9, 6};

        s.InsertionSort(arr);
        s.display(arr);

    }

}
