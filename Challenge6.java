public class Challenge6 {
    public static void main(String[] args) {
        String numb = args[0];
        String reverse = "";
        for (int i = numb.length() - 1; i >= 0; i--) {
            reverse = reverse + numb.charAt(i);
        }
        System.out.println(reverse);
    }
}
