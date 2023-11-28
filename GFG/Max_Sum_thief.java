public class Max_Sum_thief{
      //Function to find the maximum money the thief can get.
      public static int FindMaxSum(int a[], int n)
      {
      if (n == 0) return 0;
      if (n == 1) return a[0];
  
      int prevMax = a[0]; // Maximum amount for the first house
      int currMax = Math.max(a[0], a[1]); // Maximum amount for the second house
  
      for (int i = 2; i < n; i++) {
          int temp = currMax;
          currMax = Math.max(currMax, prevMax + a[i]);
          prevMax = temp;
      }
  
          return currMax;
      }
      public static void main(String[] args) {
        int [] arr={1,2,7,6,4};
        int a=5;
        System.out.println(FindMaxSum(arr,a));
      }
}