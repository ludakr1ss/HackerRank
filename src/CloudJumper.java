import java.util.Arrays;
import java.util.List;

public class CloudJumper {
    public static void main(String[] args) {
        List<Integer> cloudList = Arrays.asList(0, 0, 1, 0, 0, 1, 0);
        cloudJumper(cloudList);
    }

    public static int cloudJumper(List<Integer> c) {
        int numberOfJumps = 0;

        for (int i = 0; i < c.size() - 1; i++) {
            if (c.get(i) == 0) i++;
            numberOfJumps++;
        }

        System.out.println(numberOfJumps);
        return numberOfJumps;
    }
}
