
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine().trim());
        List<List<Integer>> sports = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> sport = new ArrayList<>();
            String[] rollNumbers = scan.nextLine().trim().split(",");
            for (String rollNumber : rollNumbers) {
                sport.add(Integer.parseInt(rollNumber));
            }
            sports.add(sport);
        }
        int day = 1;
        for (int i = 0; i < n; i++) {
            List<Integer> sport = sports.get(i);
            int fnCount = sport.size() / 2 + sport.size() % 2;
            System.out.println("Sport " + (i + 1) + " Day " + day + " FN " + getRollNumbers(sport, 0, fnCount));
            if (fnCount < sport.size()) {
                System.out.println("Sport " + (i + 1) + " Day " + day + " AN " + getRollNumbers(sport, fnCount, sport.size()));
            }
            day++;
        }
    }
    public static String getRollNumbers(List<Integer> sport, int start, int end) {
        StringBuilder rollNumbers = new StringBuilder();
        for (int i = start; i < end; i++) {
            rollNumbers.append(sport.get(i));
            if (i < end - 1) {
                rollNumbers.append(" ");
            }
        }
        return rollNumbers.toString();
    }
}
