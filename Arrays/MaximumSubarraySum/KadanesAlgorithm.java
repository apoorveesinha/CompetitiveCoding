class KadanesAlgorithm {
    int maxSubarraySum(int[] arr) {
        int sum = 0, maxSum = arr[0];
        for(int a: arr) {
            sum = Math.max(sum+a, a);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }
}