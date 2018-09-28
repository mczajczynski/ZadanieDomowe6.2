public class zadanie62 {

    public static void main(String[] args) {

        String s = "1997";
        int sum = 0;
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') sum += c - '0';
            i++;
        }
        System.out.println(sum);
    }
}
