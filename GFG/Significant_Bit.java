public class Significant_Bit{
    public static int findPosition(int N) {
        if (N == 0) {
            return 0;
        }

        int position = 1; // Initialize the position to 1 (rightmost bit)
        while (N > 0) {
            // Check if the least significant bit (rightmost bit) is set
            if ((N & 1) == 1) {
                return position;
            }

            // Right shift N to check the next bit
            N >>= 1;
            position++;
        }

        // If no set bit was found, return 0
        return 0;
    }

}