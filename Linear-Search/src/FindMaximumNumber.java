public class FindMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {10, 2 , 32, 40, 3, 43, 42, 33, 23};
        int max = findMax(nums);
        System.out.println(max);
    }
    public static int findMax(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
