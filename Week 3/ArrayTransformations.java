public class ArrayTransformations {

    static void reverseInPlace(int[] values) {
        int left = 0, right = values.length - 1;
        while (left < right) {
            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;
            left++;
            right--;
        }
    }
    static int[] reversedCopy(int[] values) {
        int[] result = new int[values.length];
        for (int i = 0; i < values.length; i++)
            result[i] = values[values.length - 1 - i];
        return result;
    }
    static int removeValue(int[] values, int target) {
        int n = 0;
        for (int i = 0; i < values.length; i++)
            if (values[i] != target)
                values[n++] = values[i];
        return n;
    }
    static int[] runningSum(int[] values) {
        int[] result = new int[values.length];
        result[0] = values[0];
        for (int i = 1; i < values.length; i++)
            result[i] = result[i - 1] + values[i];
        return result;
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        reverseInPlace(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}