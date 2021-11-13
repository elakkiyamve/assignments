public class assign_ascending_java {

    static void sort_array(int[] arr) {
        int compare = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    compare = arr[i];
                    arr[i] = arr[j];
                    arr[j] = compare;
                }
            }
        }
        System.out.println("sorted array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }

    public static void main(String[] args) {

        int a[] = {6, 1, 3};
        int b[] = {0, 1, 0, 2, 0};

        assign_ascending_java.sort_array(a);
        assign_ascending_java.sort_array(b);
    }
}



