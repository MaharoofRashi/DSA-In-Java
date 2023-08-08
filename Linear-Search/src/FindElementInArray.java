public class FindElementInArray {
    public static void main(String[] args) {
        int[] nums = {10, 2 , 32, 40, 3, 43, 42, 33, 23};
        int target = 33;
        int ans = findElement(nums, target);
        System.out.println(ans);
    }

    public static int findElement(int[] arr, int target) {
        int ans;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}