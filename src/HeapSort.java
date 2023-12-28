import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] HeapArr = {7, 6, 5, 8, 3, 5, 9, 1, 7};


//    최초 힙구성 : n/2 번만큼 heapify
        for (int i = HeapArr.length / 2 - 1; i >= 0; i--) {
            heapify(HeapArr, i);
        }

//        최초 힙구성 이후에 root노드와 마지막 (노드와 change
        System.out.println(Arrays.toString(HeapArr));
    }

    static void heapify(int[] arr, int root) {
//      xx조건의 경우에 change로직 : left와 right비교해서 자리 change
//      &&
        int left = 2 * root + 1;
        int right = 2 * root + 2;
        int temp = root;


        if (right < arr.length && arr[right] > arr[temp]) {
            temp = right;

        }
        if (left < arr.length && arr[right] > arr[temp]) {
            temp = left;
        }
        if (temp != root) {
            swap(arr, root, temp);
            heapify(arr, temp);
        }

    }

    static void swap(int[] arr, int root, int temp) {


        int arr2;
        arr2 = arr[root];
        arr[root] = arr[temp];

        arr[temp] = arr2;


    }

}