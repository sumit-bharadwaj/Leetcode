class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        //for count number of element
        int negcount =0;// for negative
        int poscount =0;// for positive

        for(int i=0; i<n; i++){
            if(nums[i]<0){
                negcount++;
            }else{ // 0 ko bhi positive man rhe h
                poscount++;
            }
        }
        // create two new array
        int[] a = new int[negcount];
        int[] b = new int[poscount];
        // index variable of two new arrays
        int ai=0;
        int bi=0;
        for(int i=0; i<n ; i++){
            if(nums[i]<0){
                a[ai]=nums[i];
                ai++;
            }else{
                b[bi]=nums[i];
                bi++;
            }
        }
        
        // square of element of two array a & b
        if(a.length != 0){
          for(ai=0; ai<a.length; ai++){
             a[ai]=a[ai]*a[ai];
         }
        }
        if(b.length != 0){
          for(bi=0; bi<b.length; bi++){
            b[bi]=b[bi]*b[bi];
         }
        }
        //reverse of array a because squar of every array change order of arrangement
        int aj=a.length-1;
        for( ai=0; ai<aj; ai++, aj--){
            int temp = a[ai];
            a[ai]=a[aj];
            a[aj]=temp;
        }
        // merge two array

        int m = a.length;
        int k = b.length;
        int[] result = new int[m+k];
        int r =0;
        ai=0;
        bi=0;
        while(ai<m && bi<k){
            if(a[ai]<=b[bi]){
                result[r]=a[ai];
                ai++;
            }else{
                result[r]=b[bi];
                bi++;
            }
            r++;
        }
        while(ai<m){
            result[r]=a[ai];
            ai++;
            r++;
        }
        while(bi<k){
            result[r]=b[bi];
            bi++;
            r++;
        }

        return result;
    }
}




