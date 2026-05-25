//Example problem
class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        int count = 0;
        int sum = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            sum = 0;
            for(int j = i;j<n;j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        System.out.println("Number of subarrays with sum equal to " + k + ": " + count);
    }
}