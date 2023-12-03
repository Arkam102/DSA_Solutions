class Remove_Duplicates {
    public int removeDuplicates(int[] nums) {
        int k=1;
        // This is because atleast one number is unique and we need to check others.
        if(nums.length==0){
            return 0;
        }
        for (int i=1; i<nums.length; i++){
            // i starts from 1 as 1 element is unique.
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k+=1;
            }
        }
         return k;
    }
}
// In this question we try to do what we can which is if != is there then we perfrom operations and if two indexes have same value then it will be
// a long process to deal with.

// Try to understand this and implement using this instead of Prac2 and why i-1 and loop starts from i=1 and k=1 try to grab that.

// In these kind of questions remember to check what the method is asking to return.
// Also remember that what is the demand of the question and what one must try to find at the end .
