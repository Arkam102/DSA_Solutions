//66. Plus One
// Optimised one is better and is Prac2.

import java.util.Arrays;
import java.util.Scanner;

public class Prac1 {
        static int [] plusOne(int[] digits) {
            int n=digits.length-1;
            
            if(digits[n]>=0 && digits[n]<9){
                    digits[n]=digits[n]+1;
                    return digits;    
                }
                

            for (int i = n; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    break;
                }
            }

            if (digits[0] == 0) {
                int[] result = new int[n + 2];
                result[0] = 1;
                return result;
            }
            return digits;
        }

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the size of Array: ");
            int size=sc.nextInt();
            int [] arr=new int[size];
            for(int i=0; i<size; i++){
                arr[i]=sc.nextInt();
            }
            int[] result = plusOne(arr);

            System.out.println("Modified Array:");
            System.out.println(Arrays.toString(result));
        }
}