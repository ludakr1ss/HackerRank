import java.util.List;

public class CountingValleys {
    public static void main(String[] args) {
        String path = "UDDDUDUU";
        int steps = path.length();
        valleyCounter(steps , path);
    }
    public static void valleyCounter(int steps, String path) {
        int counter = 0;
        int valleyCounter = 0;

        for (String s : path.split("")) {
            if (s.equals("U"))
                counter++;
            if (s.equals("D"))
                counter--;

            if (counter == 0 && s.equals("U")) {
                valleyCounter++;
            }
        }
        System.out.println(valleyCounter);
    }
}
