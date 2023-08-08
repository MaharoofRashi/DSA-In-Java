public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] nums = {10, 2 , 32, 40, 3, 43, 2, 33, 23,2};
        int target = 2;
        int firstIndex = firstOccurrence(nums, target);
        int lastIndex = lastOccurrence(nums, target);
        System.out.println(firstIndex + " " + lastIndex);
    }

    public static int firstOccurrence(int[] arr, int target) {
        int fIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                fIndex = i;
                break;
            }
        }
        return fIndex;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int lIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                lIndex = i;
            }
        }
        return lIndex;
    }
}
