import java.util.ArrayList;

public class Rotate_Bit {
     public static ArrayList<Integer> rotate(int N, int D) {
        ArrayList<Integer> result = new ArrayList<>();

        // Convert N to its binary representation as a 16-bit string
        String binaryN = String.format("%16s", Integer.toBinaryString(N)).replace(' ', '0');

        // Calculate effective left and right rotations using modulo
        int leftRotation = D % 16;
        int rightRotation = 16 - (D % 16);

        // Rotate left by leftRotation positions
        String leftRotatedBinary = binaryN.substring(leftRotation) + binaryN.substring(0, leftRotation);
        int leftRotatedDecimal = Integer.parseInt(leftRotatedBinary, 2);
        result.add(leftRotatedDecimal);

        // Rotate right by rightRotation positions
        String rightRotatedBinary = binaryN.substring(rightRotation) + binaryN.substring(0, rightRotation);
        int rightRotatedDecimal = Integer.parseInt(rightRotatedBinary, 2);
        result.add(rightRotatedDecimal);

        return result;
    }
}
