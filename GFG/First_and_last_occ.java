import java.util.Arrays;
public class First_and_last_occ {
    public static int[] find(int arr[], int n, int x) {
        int first = 0;
        int last = 0;
    
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                if (first == 0) {// used so that time complexity reduces and we find both in first pass.
                    first = i;
                }
                last = i;
            }
        }
    
        if (first != 0) {
            return new int[]{first, last};
        } else {
            return new int[]{-1, -1};
        }
    }
    
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 3, 3, 4, 5};
        int x = 3;
        System.out.println(Arrays.toString(find(arr, n, x)));// Used when we have int [] as return type.
    }
    
}
// For Arraylist as return type
/*
 ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> result = new ArrayList<>();
    
    if (n == 0) {
        result.add(-1);
        result.add(-1);
        return result;
    }

    Integer first = null;
    Integer last = null;

    for (int i = 0; i < n; i++) {
        if (arr[i] == x) {
            first = i;
            break;
        }
    }

    for (int i = n - 1; i >= 0; i--) {
        if (arr[i] == x) {
            last = i;
            break;
        }
    }

    if (first != null) {
        result.add(first);
    } else {
        result.add(-1);
    }
    
    if (last != null) {
        result.add(last);
    } else {
        result.add(-1);
    }

    return result;
}
 */
