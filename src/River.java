import java.util.Arrays;
import java.util.List;

public class River {
    public static void main(String[] args) {
        List<Integer> levels = Arrays.asList(7, 2, 3, 10, 2, 4, 8, 1);
        rivers(levels);
    }
    static void rivers(List<Integer> levels) {
        int maxDiff = -1;
        for(int i = 0; i < levels.size(); i++) {
            for(int j = 0; j < i; j++) {
                int newDiff = levels.get(i) - levels.get(j);
                if (maxDiff < newDiff) {
                    maxDiff = newDiff;
                }
            }
        }
        System.out.println(maxDiff);
    }
}
