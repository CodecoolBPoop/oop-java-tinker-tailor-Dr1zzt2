import java.util.ArrayList;

public class TinkerTailor {

    private static void tinkerGame(int n, int k) {
        ArrayList<Integer> tinkererList = new ArrayList<>();
        for (int i = 1; i <= n; i++) { tinkererList.add(i); }
        int positionCount = -1;

        while (tinkererList.size() != 1) {
            for (int i = 1; i <= k; i++) {
                if (positionCount < tinkererList.size()) {
                    positionCount ++;
                } else {
                    positionCount = 1; }

                if (i == k) {
                    tinkererList.remove(positionCount - 1);
                }
            }
        }

        System.out.println(tinkererList);
    }

    public static void main(String[] args) {
        tinkerGame(5,3);

    }
}
