public class Prac1{
    static int searchInsert(int[] nums, int target) {
        int end = nums.length - 1;
        int start = 0;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (target < nums[mid]) 
            {
                end = mid - 1;
            } 
            else if (target > nums[mid]) 
            {
                start = mid + 1;
            }
            else 
            {
                return mid; 
            }
        }
        return start;
    }
    

    public static void main(String[] args) {
        int[] a={1,2,3,5,6};
        int target=4;
        System.out.println(searchInsert(a, target));
    }
}