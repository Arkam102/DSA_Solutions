public class EquilbriumPoint {
    public static int equilibriumPoint(long[] arr, int n) {
        if (n == 0) {
            return -1; // No equilibrium point in an empty array.
        }
    
        if (n == 1) {
            return 1; // The only element in the array is the equilibrium point.
        }
    
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
    
        long leftSum = 0;
    
        for (int i = 0; i < n; i++) {
            totalSum -= arr[i]; // Subtract the current element from the total sum.
    
            if (leftSum == totalSum) {
                return i + 1; // Equilibrium point found at index i + 1 (1-based indexing).
            }
    
            leftSum += arr[i]; // Add the current element to the left sum.
        }
    
        return -1; // No equilibrium point found.
    }
    public static void main(String[] args) {
        long [] arr={1,2,5,6,3,4,1};
        int n=7;
        System.out.println(equilibriumPoint(arr, n));
    }
}
