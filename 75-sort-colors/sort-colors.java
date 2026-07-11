class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int ones=0;
        int two=0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                zero++;
            }else if(nums[i]==1){
                ones++;
            }else{
                two++;
            }
        }
        // filling 0 in nums at starting
        int index=0;
        for(int i=0; i<zero; i++){
            nums[index]=0;
            index++;
        }
        // filling 1 in nums after 0
        for(int i=0; i<ones; i++){
            nums[index]=1;
            index++;
        }
        // filling 2 in nums after 1
        for(int i=0; i<two; i++){
            nums[index]=2;
            index++;
        }

    }
}