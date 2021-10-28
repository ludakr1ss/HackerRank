public class RepeatedString {
    public static void main(String[] args) {
        stringCounter("aba", 10);
    }

    public static long stringCounter(String s, long n) {
        long numberOfA = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') numberOfA++;
        }

        long div = n / s.length();
        long rest = n % s.length();
        numberOfA = div * numberOfA;

        for (int i = 0; i < rest; i++) {
            if (s.charAt(i) == 'a') numberOfA++;
        }
        System.out.println(numberOfA);
        return numberOfA;
    }
}
