

public class ArrayKadane {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,-2,5};
        int[] arr = {-1,-2,-3,-4};
        int n = arr.length;
        int currentSum = 0;
        long maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            currentSum += arr[i];
            if(maxSum < currentSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        System.out.println("MaxSum : "+maxSum);
    }
}
