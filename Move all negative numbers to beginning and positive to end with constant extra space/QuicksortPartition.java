// Java program to Move all negative numbers
// to end and positive to beginning irrespective of order of occurence

class QuicksortPartition {

    static void segregateElements(int[] arr) {
        int n = arr.length, idx = n;
        for(int i = 0; i<n; i++){ 
            if(arr[i]<0) {
                int temp = arr[i];
                arr[i] = arr[--n];
                arr[n] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] ans = segregateElements(arr);

        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}