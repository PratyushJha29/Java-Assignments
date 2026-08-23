public class LinearSearchToolkit {

    static boolean contains(int[] values, int target) {
        for (int i = 0; i < values.length; i++)
            if (values[i] == target)
                return true;
        return false;
    }
    static int firstIndexOf(int[] values, int target) {
        for (int i = 0; i < values.length; i++)
            if (values[i] == target)
                return i;
        return -1;
    }
    static int lastIndexOf(int[] values, int target) {
        for (int i = values.length - 1; i >= 0; i--)
            if (values[i] == target)
                return i;
        return -1;
    }
    static int countOccurrences(int[] values, int target) {
        int count = 0;
        for (int i = 0; i < values.length; i++)
            if (values[i] == target)
                count++;
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 8, 2};

        System.out.println(contains(arr, 5));
        System.out.println(firstIndexOf(arr, 2));
        System.out.println(lastIndexOf(arr, 2));
        System.out.println(countOccurrences(arr, 2));
    }
}