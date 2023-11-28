public class Prac1{
    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false; // A valid mountain array must have at least 3 elements
        }
        
        int peakIndex = 0;// Peak counter is imp as it takes into account first ascending and then descending part and at last index is at last.
        
        // Find the peak of the mountain
        while (peakIndex < arr.length - 1 && arr[peakIndex] < arr[peakIndex + 1]) {
            peakIndex++;
        }
        
        // Check if the peak is not at the beginning or the end of the array
        if (peakIndex == 0 || peakIndex == arr.length - 1) {
            return false;
        }
        
        // Check the descending part of the mountain
        while (peakIndex < arr.length - 1 && arr[peakIndex] > arr[peakIndex + 1]) {
            peakIndex++;
        }
        
        // If we reached the end of the array, it's a valid mountain array
        return peakIndex == arr.length - 1;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 1}; // Example array
        boolean result = validMountainArray(arr);
        System.out.println("Is the array a valid mountain array? " + result);
    }
}