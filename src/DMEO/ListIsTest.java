package DMEO;

import java.util.HashSet;
import java.util.Set;

public class ListIsTest {

    public static void main(String[] args) {
        // 從 1~49 之間,取得六個不重複的數字
        Set<Integer> set = new HashSet<>();

        while (set.size() < 6) {
            int num = (int) (Math.random() * 49) + 1;
            set.add(num); // Set 會自動忽略重複的數字
        }

        System.out.println(set);
    }
}
