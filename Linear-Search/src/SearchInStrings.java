public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Maharoof";
        char target = 'o';
        int result = fOccerrence(str, target);
        System.out.println(result);
    }
    public static int fOccerrence(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }
}
