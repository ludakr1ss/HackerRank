import java.util.*;

class SockMerchant {
    public static void main(String[] args) {
        List<Integer> ar = (Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
        int n = ar.size();
        System.out.println(sockMerchant(n, ar));
    }

    private static int sockMerchant(int n, List<Integer> ar) {
        int pairOfSocks = 0;
        ArrayList<Integer> seenIdx = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (seenIdx.contains(i)) {
                continue;
            }
            for (int j = i+1; j < n ; j++) {

                if (ar.get(i).equals(ar.get(j))) {
                    seenIdx.add(j);
                    pairOfSocks++;
                    break;
                }
            }
        }
        return pairOfSocks;
    }
}

