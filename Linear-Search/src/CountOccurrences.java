public class CountOccurrences {
    public static void main(String[] args) {
        int[] nums = {10, 2 , 32, 40, 3, 43, 2, 33, 23,2};
        int taget = 2;
        int ans = countOcc(nums, taget);
        System.out.println(ans);
    }
    public static int countOcc(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
}
