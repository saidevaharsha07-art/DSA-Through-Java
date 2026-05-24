import java.util.*;
class Solution {
    public int[] bubbleSort(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i=0;i<N;i++){
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        nums = obj.bubbleSort(nums);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}